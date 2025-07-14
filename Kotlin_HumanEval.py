# !pip install transformers evaluate accelerate huggingface_hub jsonlines
# !pip install git+https://github.com/JetBrains-Research/mxeval.git
# !pip install -U datasets

# # Step 1: Download Kotlin compiler (command-line tools)
# !wget https://github.com/JetBrains/kotlin/releases/download/v1.9.24/kotlin-compiler-1.9.24.zip

# # Step 2: Unzip it
# !unzip -o kotlin-compiler-1.9.24.zip

# # Step 3: Add Kotlin to the system PATH
# import os
# os.environ["PATH"] += ":/content/kotlinc/bin"

# !java --version




import json
import re
from datasets import load_dataset
import jsonlines
import torch
from transformers import (
    AutoTokenizer,
    AutoModelForCausalLM,
    StoppingCriteria,
    StoppingCriteriaList,
)
from tqdm import tqdm
from mxeval.evaluation import evaluate_functional_correctness



# --- Custom stopping criterion based on Kotlin end pattern ---
class KotlinStoppingCriteria(StoppingCriteria):
    def __init__(self, stop_pattern: str, tokenizer):
        super().__init__()
        self.stop_regex = re.compile(stop_pattern)
        self.tokenizer = tokenizer

    def __call__(self, input_ids: torch.LongTensor, scores: torch.FloatTensor, **kwargs) -> bool:
        last_tokens = input_ids[0, -10:]
        decoded = self.tokenizer.decode(last_tokens, skip_special_tokens=True)
        return bool(self.stop_regex.search(decoded))


# --- Code generation function ---
def generate(problem: str, model, tokenizer, device) -> str:
    stopping_criteria = StoppingCriteriaList([
        KotlinStoppingCriteria(stop_pattern=r"\n}\n", tokenizer=tokenizer)
    ])
    inputs = tokenizer.encode(problem, return_tensors="pt").to(device)

    outputs = model.generate(
        inputs,
        max_new_tokens=256,
        min_new_tokens=128,
        pad_token_id=tokenizer.eos_token_id,
        do_sample=False,
        num_beams=1,
        stopping_criteria=stopping_criteria,
    )

    return tokenizer.decode(outputs[0], skip_special_tokens=True)


# --- Clean the generated Kotlin code ---
def clean_answer(code: str) -> str:
    # Remove block and line comments
    code = re.sub(r"/\*.*?\*/", "", code, flags=re.DOTALL)
    code = re.sub(r"//.*", "", code)

    # Find the first line that starts with "fun" and keep everything from there
    lines = code.strip().split("\n")
    for i, line in enumerate(lines):
        if line.strip().startswith("fun "):
            start = i+1
            return "\n".join(lines[start:]).strip()

    # Fallback: if no "fun" found, return original cleaned code
    return code.strip()




# Load dataset
dataset = load_dataset("jetbrains/Kotlin_HumanEval")["train"]
subset = dataset #.select(range(5))
problem_dict = {item["task_id"]: item for item in subset}


# Load model and tokenizer
model_name = "JetBrains/deepseek-coder-1.3B-kexer"
device = "cuda" if torch.cuda.is_available() else "cpu"
tokenizer = AutoTokenizer.from_pretrained(model_name)
model = AutoModelForCausalLM.from_pretrained(model_name).to(device)




# Generate and store results
output = []
for task_id in tqdm(problem_dict, desc="Generating", leave=False):
    prompt = problem_dict[task_id]["prompt"]
    raw_output = generate(prompt, model, tokenizer, device)
    print(raw_output)
    cleaned_output = clean_answer(raw_output)
    print('prompt:', prompt)
    print('output:', cleaned_output)
    output.append({
        "task_id": task_id,
        "completion": cleaned_output,
        "language": "kotlin"
    })

# Save completions to file
output_file = "answers.jsonl"
with jsonlines.open(output_file, mode="w") as writer:
    writer.write_all(output)




# Evaluate
evaluate_functional_correctness(
    sample_file=output_file,
    k=[1],
    n_workers=4,
    timeout=15,
    problem_file=problem_dict,
)

# Print results
results_file = "answers.jsonl_results.jsonl"
total, correct = 0, 0
with open(results_file) as f:
    for line in f:
        res = json.loads(line)
        print(res)
        total += 1
        correct += res.get("passed", 0)

print(f"Pass rate: {correct}/{total} = {correct / total:.2%}")

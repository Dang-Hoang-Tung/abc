import re
import os

def sanitize_filename(task_id):
    return task_id.replace("/", "_")

def extract_outputs_and_save(input_file="foo.txt", output_dir="samples"):
    os.makedirs(output_dir, exist_ok=True)

    with open(input_file, "r", encoding="utf-8") as file:
        text = file.read()

    # Match TASK ID and the section that immediately follows Output:
    pattern = re.compile(
        r"TASK ID (\S+).*?Output:\n(.*?)(?=(?:\nTASK ID |\Z))",
        re.DOTALL
    )

    matches = pattern.findall(text)

    for task_id, output in matches:
        sanitized_id = sanitize_filename(task_id)
        clean_output = output.strip()

        filename = os.path.join(output_dir, f"{sanitized_id}.java")
        with open(filename, "w", encoding="utf-8") as f:
            f.write(clean_output)

    print(f"Extracted {len(matches)} output blocks to '{output_dir}'")

# Run the function
extract_outputs_and_save()

import json

def extract_passed_task_ids(input_file="eval.jsonl", output_file="passed_tasks.txt"):
    passed_ids = []

    with open(input_file, "r", encoding="utf-8") as f:
        for line in f:
            if not line.strip():
                continue  # skip empty lines
            try:
                data = json.loads(line)
                if data.get("passed") is True:
                    passed_ids.append(data["task_id"])
            except (json.JSONDecodeError, KeyError):
                continue  # skip malformed lines

    # Write the passed task IDs to the output file
    with open(output_file, "w", encoding="utf-8") as f:
        for task_id in passed_ids:
            f.write(task_id + "\n")

    print(f"Wrote {len(passed_ids)} passed task IDs to '{output_file}'.")

# Run the function
extract_passed_task_ids()

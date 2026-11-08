import json
import glob

for file in glob.glob("**/*.json", recursive=True):
    try:
        with open(file, 'r', encoding='utf-8') as f:
            json.load(f)
    except Exception as e:
        print(f"Erreur dans {file} : {e}")

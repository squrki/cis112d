import json

# 2. Static Data Storage(10 Points)
# You will create a module to retrieve and edit a static file
# (exp: a JSON file). This will serve as static storage for your app.
# Anytime your user edits the content via the GUI the update should be
# stored in the JSON file.


def save_content(content, filename="finalcontent.json"):
    with open(filename, "w") as file:
        json.dump({"content": content}, file)


def load_content(filename="finalcontent.json"):
    try:
        with open(filename, "r") as file:
            data = json.load(file)
            html_code = data.get("content", "")
            return html_code
    except FileNotFoundError:
        return "Please enter your webpage content here."

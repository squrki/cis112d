import filemanager

# 3. Webpage Creation(10 Points)
# Whenever your user edits content, the app should also publish a static
# webpage file with the revised content, overwriting previous drafts of
# the site.
# Make a module that does this and have the GUI import it as part of the
# operations of the app.


def writeHTMLFile(filename="finalwebpage.html"):
    html_code = f"""<!DOCTYPE html>
    <html>
    <head>
        <title>CIS-112 Final</title>
    </head>
    <body>
        <h1>Welcome to My CIS-112 Final Project</h1>
        <div id="content">{filemanager.load_content()}</div>
    </body>
    </html>
    """
    begin = html_code.find("content") + 9
    end = html_code.find("</div>")
    code_with_breaks = html_code[:begin] + html_code[begin:end].replace(
        '\n', '<br>\n        ') + html_code[end:]
    with open(filename, "w") as file:
        file.write(code_with_breaks)

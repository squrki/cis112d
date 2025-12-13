import tkinter as tk
import filemanager as filemanager
import htmlmaker as htmlmaker

# Components:
# 1. Content Editing UI(20 Points)
# Your app will include a GUI application that can read in and
# modify the text of a webpage you will want to to publish


class cms(tk.Tk):

    def __init__(self):
        super().__init__()
        self.title("Content Management System")
        self.nameLabel = tk.Label(
            self, text="Please enter the webpage text: ", anchor="w")
        self.nameLabel.grid(row=0, column=0)
        self.textEntry = tk.Text(self, height=5, width=50)
        self.textEntry.insert("1.0", filemanager.load_content())
        self.textEntry.grid(row=1, column=0)
        self.submit = tk.Button(self, text="Submit",
                                command=self.submit)
        self.submit.grid(row=2, column=0)
        self.exit = tk.Button(self, text="Exit", command=self.destroy)
        self.exit.grid(row=3, column=0)

    def submit(self):
        content = self.textEntry.get("1.0", tk.END)
        filemanager.save_content(content)
        htmlmaker.writeHTMLFile()

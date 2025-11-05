import tkinter as tk

def buttonClick():
    entry = name.get()
    language = choice.get()
    
    if entry == "":
            greeting.config(text = f"Please enter your name.", bg = "red")
    else :
        match language:
            case "English":
                greeting.config(text = f"Hello, {entry}", bg = "pink")
            case "Spanish":
                greeting.config(text = f"Hola, {entry}", bg = "light green")
            case "Korean":
                greeting.config(text = f"안녕하세요, {entry}", bg = "cyan")
            case _:
                greeting.config(text = f"Please select a language.", bg = "red")

root = tk.Tk()

root.title("Greeting App")
root.config(bg="yellow")

nameLabel = tk.Label(root, text="Please enter your name.")
nameLabel.pack()

name = tk.Entry(root)
name.pack()

languageLabel = tk.Label(root, text="Please select your preferred language.")
languageLabel.pack()

langOptions = ["English", "Spanish", "Korean"]

choice = tk.StringVar(root)

lang = tk.OptionMenu(root, choice, *langOptions)
lang.pack()

button = tk.Button(root, text="Greet Me", command=buttonClick, bg = "Orange")
button.pack()

greeting = tk.Label(root)
greeting.pack()

root.mainloop()
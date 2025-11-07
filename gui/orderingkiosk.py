import tkinter as tk
from tkinter import ttk

class OrderingKiosk:
    def submitOrder():
        orderName = name.get()
        orderDrink = drink

    root = tk.Tk()
    root.title("Ordering Kiosk")
    root.config(bg="yellow")

    nameLabel = tk.Label(root, text="Please enter your name.", anchor="w")
    nameLabel.pack()

    name = tk.Entry(root)
    name.pack()

    drink = tk.Checkbutton(root)
    entreeLabel = tk.Label(root, text="Please select your entree.")
    entreeLabel.pack()
    entree = ttk.Combobox(root, values=("hamburger", "pizza", "hotdog"))
    entree.pack()
    submit = tk.Button(root, text="Submit Order", command=submitOrder)
    submit.pack()

    
    root.mainloop()

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



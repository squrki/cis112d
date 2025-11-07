import tkinter as tk
from tkinter import ttk

class OrderingKiosk (tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("Ordering Kiosk")
        self.config(bg="yellow")
        # self.geometry("500x500")
        self.grid_rowconfigure(0, weight=1)
        self.grid_columnconfigure(0, weight=1)
        

        self.nameLabel = tk.Label(self, text="Please enter your name.", anchor="w")
        self.nameLabel.grid(row=0, column=0)
        self.name = tk.Entry(self)
        self.name.grid(row=0, column=1)

        self.drinkLabel = tk.Label(self, text="Would you like to add a drink to your order? (check for yes)")
        self.drinkLabel.grid(row=1,column=0)
        self.drinkvar=tk.BooleanVar()
        self.drinkvar.set(False)
        self.drink = tk.Checkbutton(self, variable=self.drinkvar)
        self.drink.grid(row=1,column=1)

        self.entreeLabel = tk.Label(self, text="Please select your entree.")
        self.entreeLabel.grid(row=2, column=0)
        self.entree = ttk.Combobox(self, values=("hamburger", "pizza", "hotdog"))
        self.entree.grid(row=2, column=1)

        self.submit = tk.Button(self, text="Submit Order", command=self.submitOrder)
        self.submit.grid(row=3, column=0)

        self.orderName = tk.Label(self)
        self.orderDrink = tk.Label(self)
        self.orderEntree = tk.Label(self)

    def submitOrder(self):
        if self.name.get() == "":
            self.orderName.configure(text="Please enter your name.", color = "red")
        if self.orderEntree.get() == "":
            self.orderEntree.configure(text="Please select an entree.", color = "red")
        self.orderName.configure(text = self.name.get())
        txt = "No drink with order"
        if self.drinkvar.get():
            txt = "Include drink with order"
        self.orderDrink.configure(text=txt)
        self.orderEntree.configure(text=self.entree.get())
        self.orderName.grid(row=4, column = 0)
        self.orderDrink.grid(row=5, column = 0)
        self.orderEntree.grid(row=6, column = 0)

if __name__ == "__main__":
    app = OrderingKiosk()
    app.mainloop()
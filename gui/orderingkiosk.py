import tkinter as tk
from tkinter import ttk


class OrderingKiosk (tk.Tk):
    def __init__(self):
        # define root
        super().__init__()
        self.title("Ordering Kiosk")
        self.config(bg="yellow")
        self.grid_rowconfigure(0, weight=1)
        self.grid_columnconfigure(0, weight=1)

        # get customer name
        self.nameLabel = tk.Label(
            self, text="Please enter your name.", anchor="w", bg="yellow")
        self.nameLabel.grid(row=0, column=0)
        self.name = tk.Entry(self)
        self.name.grid(row=0, column=1)

        # get drink order
        self.drinkLabel = tk.Label(
            self, text="Would you like to add a drink to your order? (check for yes)", bg="yellow")
        self.drinkLabel.grid(row=1, column=0)
        self.drinkvar = tk.BooleanVar()
        self.drinkvar.set(False)
        self.drink = tk.Checkbutton(self, variable=self.drinkvar)
        self.drink.grid(row=1, column=1)

        # get entree order
        self.entreeLabel = tk.Label(
            self, text="Please select your entree.", bg="yellow")
        self.entreeLabel.grid(row=2, column=0)
        self.entree = ttk.Combobox(
            self, values=("Hamburger", "Pizza", "Hot Dog"))
        self.entree.grid(row=2, column=1)

        # submit button
        self.submit = tk.Button(self, text="Submit Order",
                                command=self.submitOrder, bg="light green")
        self.submit.grid(row=3, column=0)

        # display order
        self.displayOrder = tk.Label(self, text="Your order:", bg="yellow")
        self.orderName = tk.Label(self, anchor="w")
        self.orderDrink = tk.Label(self, anchor="w")
        self.orderEntree = tk.Label(self, anchor="w")

    # submit order function
    def submitOrder(self):
        # handle empty name entry
        if self.name.get() == "":
            self.orderName.configure(text="Please enter your name.", bg="red")
            self.orderName.grid(row=4, column=0)

        # handle empty entree combobox
        elif self.entree.get() == "":
            self.orderEntree.configure(
                text="Please select an entree.", bg="red")
            self.orderEntree.grid(row=4, column=0)

        # display order
        else:
            self.orderName.configure(
                text="Name:\t   " + self.name.get().title(), bg="white")
            txt = "Drink cup?\t   No"
            if self.drinkvar.get():
                txt = "Drink cup?\t   Yes"
            self.orderDrink.configure(text=txt, bg="white")
            self.orderEntree.configure(
                text="Entree:\t   " + self.entree.get(), bg="white")

            self.displayOrder.grid(row=5, column=0)
            self.orderName.grid(row=4, column=1, sticky=tk.EW)
            self.orderDrink.grid(row=5, column=1, sticky=tk.EW)
            self.orderEntree.grid(row=6, column=1, sticky=tk.EW)


if __name__ == "__main__":
    app = OrderingKiosk()
    app.mainloop()

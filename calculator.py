#calculator.py functions start here:
# class calculator:
#add()
def add(x, y):
    return x + y

#subtract()
def subtract(x, y):
    return x - y

#multiply()
def multiply(x, y):
    return x * y

#divide()
def divide(x, y):
    if y == 0:
        return "Error: Division by zero!"
    return x / y

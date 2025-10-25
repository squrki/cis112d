"""This file is a calculator demo file."""


def calculate_sum(a, b):
    """Return sum of two arguments."""
    return a + b


def calculate_product(a, b):
    """Return product of two arguments."""
    return a * b


def main():
    """Run main function."""
    x = 5
    y = 10
    result_sum = calculate_sum(x, y)
    result_product = calculate_product(x, y)

    print("Result of sum is:", result_sum)
    print("Result of product is:", result_product)

    if result_sum > 10:
        print("The result of the sum is greater than 10.")

    else:
        print("The result of the sum is less than or equal to 10.")

    if result_product > 20:
        print("The result of the product is greater than 20.")

    else:
        print("The result of the product is less than or equal to 20.")


if __name__ == "__main__":
    main()

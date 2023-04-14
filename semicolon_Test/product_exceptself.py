def product_except_self(number):
    array = len(number)
    products = [0] * number
    product = 1

    for i in range(array):
        products[i] = product
        product *= number[i]

    product = 1

    for i in range(array-1, -1, -1):
        products[i] *= product
        product *= number[i]

    return product

number = [1, 2, 3, 4]
result = product_except_self(number)
print(result)

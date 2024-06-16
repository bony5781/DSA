def factorial(num):
    if num == 0:
        return 1
    else:
        return num * factorial(num - 1)

num = int(input("Which number you want to factorial of : "))
print(f"Factorail of {num} is {factorial(num)}") 
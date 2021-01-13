print("Write a Python program that throws a NameError.")

try:
    print(a)
except NameError:
    print("This is in exception as 'a' is not yet defined.")
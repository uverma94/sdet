#Activity 8 - List Checker

numbers = list(input("Enter a sequence of comma seperated values ").split(","))

print(numbers)
length = int(len(numbers))

#return True if first and last number of a list is same
if (numbers[0]==numbers[-1]):
    print("True")
else:
    print("False")

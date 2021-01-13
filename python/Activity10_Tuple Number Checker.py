number = tuple(input("Enter a Sequence of numbers seperated by comma: ").split(","))
print("Numbers divisible by 5 are: ")
for num in number:
    if (int(num) % 5 == 0):
        print(num)


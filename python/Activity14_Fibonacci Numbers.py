number = int(input("Please let us know how many Fibonnaci numbers you want: "))

def fibonacci(n):
    if n<=1:
        return n
    else:
        return(fibonacci(n-1)+fibonacci(n-2))

if number<=0:
    print("Please enter a positive number")
else:
    print("Fibonacci series: ")
    for i in range(number):
        print(fibonacci(i))
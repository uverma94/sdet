def recursiveadder(n):
    if n:
        return n + recursiveadder(n-1)
    else:
        return 0
        
sum = recursiveadder(10)
print("Sum of number from 0 to 10 is :", sum)


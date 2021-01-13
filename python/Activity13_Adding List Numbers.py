ListofNumbers = [5,10,20,25,30]

def sumofnumbers(num):
    sum=0
    for number in num:
        sum=sum+number
    return sum

res = sumofnumbers(ListofNumbers)

print("Sum of all numbers in list: " +str(res))


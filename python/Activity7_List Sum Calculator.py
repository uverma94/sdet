#empty list
list1 = []

number = int(input("Please enter the size of list you want "))#Asking user for number of elements in list

for i in range(0,number):
    print("Now enter the numbers: ")
    x = int(input())
    list1.append(x)
print(list1)

temp = 0
for number in list1:	
  temp += int(number)	
print("Sum of all elements in list :")
print(temp)



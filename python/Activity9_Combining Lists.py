	
List1 = [12,13,14,15,16,17]
List2 = [20,21,22,23,24,25]

	
print("First List ", List1)
print("Second List ", List2)

newList = []

for i in List1:
    if (i % 2 != 0):
        newList.append(i)

for j in List2:
    if (j % 2 == 0):
        newList.append(j)

print("New List is: ", newList)

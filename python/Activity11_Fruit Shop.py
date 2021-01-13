fruit_price = {"mango":50, "grapes":34, "orange":80, "banana":30, "strawberry":"40"}


while True:
    userchoice = str(input("what fruit you want? ").lower())

    if(userchoice in fruit_price):
        print(userchoice, "is available")
    else:
        print(userchoice, "is not available")

    newchoice = input("Do you need another fruit - yes/no? ")

    if(newchoice == "yes" ):
        pass
    elif(newchoice == "no"):
        print("Thank You! Good Day!")
        raise SystemExit
    else:   
        print("Please enter a valid input - 'yes/no' only")
        raise SystemExit

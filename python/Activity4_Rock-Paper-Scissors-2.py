name1 = input("Enter the First player name - ")
name2 = input("Enter the Second player name - ")

while True:
    answer1_name1 = input("Hi " +name1+" what you want - Rock/Paper/Scissor? ").lower()
    answer2_name2 = input("Hi " +name2+" what you want - Rock/Paper/Scissor? ").lower()

    if answer1_name1 == answer2_name2:
        print("Ohhooo! It's a Tie")
    elif answer1_name1 == 'rock':
        if answer2_name2 == 'scissor':
         print("rock wins!")
        else:
         print("paper wins!")
    elif answer1_name1 == 'scissor':
        if answer2_name2 == 'paper':
         print("scissor wins")
        else:
         print("rock wins!")
    elif answer1_name1 == 'paper':
        if answer2_name2 == 'rock':
         print("paper wins!")
        else:
         print("scissor wins!")
    else:
        print("Please enter a valid input. Enter rock/paper/scissor")
#asks the user if they want to play another round.

    ask_user = input("Do you want to play another round? - yes/no ").lower()
    if(ask_user=="yes"):
        pass
    elif(ask_user=="no"):
        raise SystemExit
    else:
        print("Sorry!Please enter a valid input - yes/no")
        raise SystemExit
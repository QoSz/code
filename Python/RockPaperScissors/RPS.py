import random

user_wins = 0
computer_wins = 0

options = ["rock", "paper", "scissors"]

while True:
    user_input = input("Enter Rock/Paper/Scissors or 'q' to quit: ").lower()

    if user_input == "q":
        break

    if user_input not in options:
        continue

    random_number = random.randint(0, 2)
    computer_pick = options[random_number]
    print(f"The computer picked {computer_pick}")

    if user_input == "rock" and computer_pick == "scissors":
        print("You win!")
        user_wins += 1
    elif user_input == "paper" and computer_pick == "rock":
        print("You win!")
        user_wins += 1
    elif user_input == "scissors" and computer_pick == "paper":
        print("You win!")
        user_wins += 1
    elif user_input == computer_pick:
        print("Draw")
    else:
        computer_wins += 1

print("You won {} times".format(user_wins))
print("The computer won {} times".format(computer_wins))
print("Good bye see you next time!")

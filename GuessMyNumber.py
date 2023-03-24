import random

num = random.randint(1, 10)

guess = None

while guess != num:
    guess = input("Guess a number between 1 and 10: ")
    guess = int(guess)

    if guess == num:
        print(f"Congratulations! You won. {num} was the winning number.")
    elif guess > num:
        print("Nope, sorry. Your guess {guess} is too high.")
    elif guess < num:
        print("Nope, sorry. Your guess {guess} is too low.")


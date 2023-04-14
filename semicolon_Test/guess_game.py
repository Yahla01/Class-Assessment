month_of_birth = 4
year_of_birth = 2000

while True:
    guess = int(input("Guess date of birth: "))
    if guess == 14:
        print("CORRECT")
        break
    else:
        print("WRONG")
        print("Guess Again")


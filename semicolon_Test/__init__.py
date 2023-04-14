print("S\nE\nM\nI\nC\nO\nL\nO\nN")



Ugo= "Mississippi"
s_count = Ugo.count ('s')
i_count = Ugo.count ('i')

print ("Number of occurence of 'i':", s_count)
print ("Number of occurence of 'i':", i_count)


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


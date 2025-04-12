# I Justin Challis, 001137680, certify that this work is my own
# effort and that I have allowed anyone else to copy from it.

# Functions-------------------------------->

import random


def checkGuess(secretNumber, guess):
    if int(secretNumber) == int(guess):
        result = 0
    elif secretNumber > guess:
        result = 1
    else:
        result = -1
        return result


# Main line of code-------------------------->

# GET username FROM keyboard
username = input( "Please enter your name ")

# SET score = 0
score = 0

# CALCULATE a secret number using the formula length of username * a random integer [1,5]
secretNumber = len( username )* random.randint(1,5)

# SET guesses = 0
guesses = 0

# SHOW “Hello ” username “ welcome to the guessing game.”
print("Hello " + username + " welcome to the guessing game.")

#LOOP


counter = 0
while counter < 3:
    remaining = 3 - guesses
    print("You have " + str(remaining) + " guesses left ")
    guess = input("What is your guess? ")
    guesses = guesses + 1
    result = checkGuess
    counter += 1
    
    if result == 0 and guesses == 1:
        print( "Amazing! On your first guess!")
        score = score + 10
    elif result == 0 and guesses == 2:
        print( "Excellent! On your second guess!")
        score = score + 5
    elif result == 0 and guesses == 3:
        print( "Lucky! On your last guess!")
        score = score + 1

    if result == 1:
        print(str( "Your guess " + str(guess) + " was too low!"))
    else:
        print(str( "Your guess " + str(guess) + " was too high!"))
        


print(str("Thank you for playing, " + username + " your score was " + str(score) + " points"))


               # SET remaining = 3 - guesses
               # SHOW “You have “ remaining “ guesses left”
               # SHOW “What is your guess?”
               # GET guess FROM keyboard
               # SET guesses = guesses + 1
               # CALL checkGuess WITH secret number and guess
               # SET result TO return value of checkGuess call
               # IF result IS 0 THEN
                               # IF guesses IS 1 THEN
                                               # SHOW “Amazing! On your first guess!
                                                #SET score = score + 10
                                # ELSE
                                                #IF guesses IS 2
                                                 #               SHOW “Excellent!  On your second guess!”
                                                 #             SET score = score + 5
                                                #ELSE
                                                 #               SHOW “Lucky! On your last guess!”
                                                 #               SET score = score + 1
                                                #ENDIF
                                # ENDIF
                                # EXIT LOOP
               # ELSE
                              #  IF result IS 1 THEN
                              #                  SHOW “Your guess, “ guess “, was too low!
                              #  ELSE
                              #                  SHOW “Your guess, “ guess “, was too high!”
                              #  ENDIF
                # ENDIF
                #IF guesses IS 3 THEN
                #                EXIT LOOP
                # ENDIF
# END LOOP

# SHOW “Thank you for playing, “ username “, your score was “ score “points.”

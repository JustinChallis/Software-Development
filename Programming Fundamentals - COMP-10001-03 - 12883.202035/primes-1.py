# I Justin Challis, 001137680, certify that this work is my own effort and that I have not allowed anyone else to copy from it.


primeList = []

valid = False
while not valid:
    number = input("Enter an integer greater than or equal to 100: " )
    if number.isdecimal():
        n = int( number )
        if n == 2:
            valid = True
        elif n > 2:
            valid = False
        else:
            valid = False
            print( "Must be larger than the number 2." )

    else:
        valid = False
        print( "Must be a number." )

        

print( "The Prime numbers up too and including your number ", n )




count = 2
while count <= n:
    primeList = primeList + [count2]
    count += 1

count2 = 2
for x in primeList:
    for y in primeList:
        if x != count and x % count2 == 0:
            primeList.remove( x )
    count2 += 1

print( primeList/n ) * [count2 - count]
        

# I Justin Challis, 001137680, certify that this work is my own effort and that I have not allowed anyone else to copy from it.



def oldMacDonald( animalName, animalSound ):
    counter = 0
    while counter >= 0 and counter < 3:
            print("")
            print( "Old Macdonald had a farm, E-I-E-I-O!" )
            print( "On his farm he had a " + str(animalName[0 + counter]) + ", E-I-E-I-O!" )
            print( "With a(n) " + str(animalSound[0 + counter]) + " " + str(animalSound[0 + counter]) + " here and a(n) " + \
               str(animalSound[0 + counter]) + " " + str(animalSound[0 + counter]) + " there, here a " + \
               str(animalSound[0 + counter]) + ", there a(n) " + str(animalSound[0 + counter]) + " everywhere a(n) " + \
               str(animalSound[0 + counter]) + " " + str(animalSound[0 + counter]) + "!" )
            print( "Old MacDonald had a farm, E-I-E-I-O!" )
            print("")
            counter += 1
        
            


# ---------- Main line of code ----------

animalNameList = []
animalSoundList = []


count = 0

while count >= 0 and count <3:
    animalName = animalNameList
    animalNameList.append(input("Please enter an animal name (or q to quit): "))
    animalSound = animalSoundList
    animalSoundList.append(input("Please enter an animal sound (or q to quit): "))
    farmHouseList = [[animalNameList], [animalSoundList]]
    count += 1
        
    
    
    

oldMacDonald( animalName , animalSound ) 





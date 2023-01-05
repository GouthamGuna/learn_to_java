name = input("Enter a username : ")

#result=len(name)

#name=name.find(" ")

if len(name) > 12:
    print("Your username can't be more than 12 character's")
elif not name.find(" ") ==-1:
    print("Your username can't contain spaces")
elif not name.isalpha():
    print("Your username can't contain numbers")
else:
    print(f"Welcome {name}")


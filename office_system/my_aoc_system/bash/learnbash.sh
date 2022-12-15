#!/bin/bash

author="Gowtham Sankar Gunasekar"
user=$(whoami)
whereami=$(pwd)
date=$(date)
ip=$(ip addr)
os=$(cat /etc/os-release)
arg=$1

echo "Enter your name?"

read  username

sleep 3

echo " "
echo "welcome $username!"
echo " "

sleep 3

echo "Your are currently logged in as : $user and you are in the directory : $whereami. Also today is : $date"
echo " "

sleep 3

echo "current ip address is : "
echo " "
echo "$ip"
echo " "

sleep 3

echo "your system info : "
echo " "
echo "$os"
echo " "

echo "script by $author... $arg!"
echo " "
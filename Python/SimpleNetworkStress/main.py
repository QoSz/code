import time
import socket

#Define a function to connect to a given IP
def connect(ip):
  s = socket.socket()
  s.connect((ip, 60443))
  s.close()
  print("Connection to ", ip, "sucessful")

#Define a function to send multiple requests to the given IP
def stress(ip):
    while True:
        connect(ip)
        time.sleep(1)

#Call the stress function with your desired IP
stress("197.254.119.46")
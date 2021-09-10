import socket

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)  # Creating a socket for the client to connect to the server
s.connect(('127.0.0.1', 55555))
message = s.recv(1024)  # Receiving the message from the server
s.close()  # Closing the connection

print(message.decode())

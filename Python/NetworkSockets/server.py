import socket

# Creating a TCP socket
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.bind(('127.0.0.1', 55555))  # Creating the location where the socket will run so local host
s.listen() # Listens for any incoming client connections

while True:
    client, address = s.accept()  # Accepts the incoming connections from any clients
    print('You are connected to {}'.format(address))
    client.send('You are connected!'.encode())
    client.close()

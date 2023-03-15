import socket
import time

dns_servers = [
    "8.8.8.8", # Google
    "8.8.4.4", # Google
    "208.67.222.222", # OpenDNS
    "208.67.220.220", # OpenDNS
    "208.67.222.220", # Norton ConnectSafe
    "208.67.220.222", # Norton ConnectSafe
    "208.67.222.222", # GreenTeamDNS
    "208.67.220.220", # GreenTeamDNS
    "9.9.9.9", # Quad9
    "149.112.112.112", # Quad9
]

for dns_server in dns_servers:
    try:
        start = time.time()
        socket.gethostbyname("example.com")
        end = time.time()
        print(f"{dns_server} responded in {end - start} seconds")
    except socket.gaierror as e:
        print(f"{dns_server} failed: {e}")

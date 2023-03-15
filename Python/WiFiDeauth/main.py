#!/usr/bin/env python
import subprocess
import time

# Get the list of connected clients
try:
    clients = subprocess.check_output(["iw", "dev", "wlan0", "station", "dump"]).decode('utf-8').split('\n')
except FileNotFoundError:
    print("Error: The system cannot find the file specified")
    exit(1)

# Filter out empty lines
clients = list(filter(None, clients))

# Get the list of MAC addresses from the connected clients
macs = [client.split(' ', 1)[0] for client in clients]

# Send a deauth packet to each MAC address
for mac in macs:
    try:
        subprocess.call(["iw", "dev", "wlan0", "station", "del", mac])
        time.sleep(0.2)
    except FileNotFoundError:
        print("Error: The system cannot find the file specified")
        exit(1)

print("Successfully deauthenticated everyone from the wifi network")
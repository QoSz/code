import subprocess
import re

# Get the list of wifi networks
wifi_list = subprocess.check_output(['netsh', 'wlan', 'show', 'networks']).decode('utf-8').split('\n')

# Extract the SSID of the available networks
ssids = [i.split(':')[-1].strip() for i in wifi_list if 'SSID' in i]

# Prompt user to select a network
print('Available networks:')
for i, ssid in enumerate(ssids):
    print(f'{i} - {ssid}')

# Get the network selected by user
selected_ssid = ssids[int(input('\nSelect a network: '))]

# Get the security settings of the selected network
security_settings = subprocess.check_output(['netsh', 'wlan', 'show', 'profile', selected_ssid, 'key=clear']).decode('utf-8').split('\n')

# Extract the security type
security_type_list = [i.split(':')[-1].strip() for i in security_settings if 'Security' in i]
security_type = security_type_list[0] if security_type_list else None

# Extract the password
password_list = [i.split(':')[-1].strip() for i in security_settings if 'Key Content' in i]
password = password_list[0] if password_list else None

print(f'\nSelected SSID: {selected_ssid}')
print(f'Security Type: {security_type}')
print(f'Password: {password}')
from struct import *

"""
Converting data to byte data
pack(format, values) -> Takes format and values
the format can be int, floats or String etc. 
'iif' - int, int, float

unpack(format, byte data) -> Used to convert byte
data back into its original form.

calcsize() -> calculates the amount of data required
to store the data.
"""

# Converting byte data back into its orignal form
packed_data = pack('iif', 12, 69, 3.142)
print(packed_data)

print(calcsize('i'))
print(calcsize('f'))
print(calcsize('iif'))

# Converting byte data back into its original form
original_data = unpack('iif', packed_data)
print(original_data)

# Same as above
original_data = unpack('iif', b'\x0c\x00\x00\x00E\x00\x00\x00\x87\x16I@')
print(original_data)

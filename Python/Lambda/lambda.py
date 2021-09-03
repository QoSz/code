""" creating a simple Lambda function
 Lambda functions are basic functions without needing a name and are suitable for one time use.
 It is not best practise to use lambda functions for repeating code and therefore it is better to use def.
 """
x = lambda x: (x + 2) * 3
print(x(4))

add = lambda y, z: y + z
print(add(3, 4))

print('=======================')
# Combining first and last names
first_name = ['Yash', 'Taylor', 'Bucky']
last_name = ['Shah', 'Swift', 'Roberts']

names = zip(first_name, last_name)

for a, b in names:
    print(a, b)

print('=======================')
# Multiplying number with two lists
a = [1, 2, 3, 4, 5]
b = [6, 6, 6, 6, 6]

ab = zip(a, b)

for x, y in ab:
    print(x * y)

# Converting a list of string numbers to a list of int numbers using map. NOT PART OF THIS TOPIC.
print('=======================')

a = ['12', '16', '36', '69', '66', '88']
print(a)
print(type(a[1]))

b = list(map(int, a))
print(b)
print(type(b[1]))
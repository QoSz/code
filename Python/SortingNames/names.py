from operator import itemgetter

names = [
    {'fname': 'Shawn', 'lname': 'Mendez'},
    {'fname': 'Bucky', 'lname': 'Roberts'},
    {'fname': 'Taara', 'lname': 'Adami'},
    {'fname': 'Adam', 'lname': 'Sandler'},
    {'fname': 'Tom', 'lname': 'Hanks'},
    {'fname': 'Robert', 'lname': 'Santos'},
    {'fname': 'Robert', 'lname': 'Anthony'},
    {'fname': 'Robert', 'lname': 'Carlo'},
]

for x in sorted(names, key=itemgetter('fname')):
    print(x)
    
print('-------')

for x in sorted(names, key=itemgetter('fname', 'lname')):
    print(x)
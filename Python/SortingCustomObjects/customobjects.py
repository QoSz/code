from operator import attrgetter


class User:

    def __init__(self, x, y):
        self.name = x
        self.user_id = y

    def __repr__(self):
        return self.name + ' : ' + str(self.user_id)


users = [
    User('Bucky', 10),
    User('Roberts', 43),
    User('Khalid', 19),
    User('CR7', 7),
    User('Zlatan', 666),
    User('Juice', 999)
]

print("Default")
for user in users:
    print(user)
print('------')

print("By name")
for user in sorted(users, key=attrgetter('name')):
    print(user)
print('------')

print("By ID")
for user in sorted(users, key=attrgetter('user_id')):
    print(user)

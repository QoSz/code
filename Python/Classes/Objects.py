class Objects():

    persons_added = 0

    def __init__(self, name, age, height):
        self.name = name
        self.age = age
        self.height = height
        Objects.persons_added += 1

    def __str__(self):
        return f"Name {self.name}, Age {self.age}, Height {self.height}"

    def __del__(self):
        Objects.persons_added -= 1


person1 = Objects("Yash", 19, "5ft 9inches")
print(person1)
print(Objects.persons_added)

print("----------------")
person2 = Objects("Keyul", 22, "5ft 9inches")
print(person2)
print(Objects.persons_added)

del person2
print("Deleted person2")
print("Only " + str(Objects.persons_added) + " person has been added")

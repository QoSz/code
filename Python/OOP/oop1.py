# This is very error prone
# position, name, age, level, salary
se1 = ["Software engineer", "Max", 23, "Junior", 5000]
se2 = ["Software engineer", "Lisa", 28, "Senior", 7000]


# Instead use a class as it is less error prone
# Class -> Is a blue print of an object.
class SoftwareEngineer:
    # Class attribute
    # Class attribute is accessible by all objets where as instance attributes are only accessible by one object.
    alias = "Keyboard Magician"

    def __init__(self, name, age, level, salary):
        # Instance attributes/variables
        self.name = name
        self.age = age
        self.level = level
        self.salary = salary


# Instance (Objects)
se1 = SoftwareEngineer("Max", 23, "Junior", 5000)
print(se1.name, se1.salary)
print(se1.alias)
se2 = SoftwareEngineer("Lisa", 28, "Senior", 7000)
print(se2.name)
print(SoftwareEngineer.alias)

# Recap
# Created a class (Blueprint)
# Created an instance (Also known as an object)
# know the difference between an instance and a class
# Instance attributes are defined in the __init__(self) function
# Class attribute

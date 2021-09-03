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

    # Instance Methods
    def coding(self):
        print(f"{self.name} is writing code...")

    def coding_language(self, language):
        print(f"{self.name} is writing code in {language}")

    def information(self):
        information = f"name = {self.name}, age = {self.age}, salary = {self.salary}"
        return information

    # Using dunder methods (These are special methods provided by python e.g __init__(self) and __str__(self))
    def __str__(self):
        information = f"name = {self.name}, age = {self.age}, salary = {self.salary}"
        return information

    def __eq__(self, other):
        return self.name == other.name and self.age == other.age

    # Using a static method (Does not need "self" to be passed as an argument in the method
    # This method is not tied to a specific instance
    @staticmethod
    def entry_salary(age):
        if age < 25:
            return 5000
        if age < 30:
            return 7000
        return 9000


# Instance (Objects)
se1 = SoftwareEngineer("Max", 23, "Junior", 5000)
se2 = SoftwareEngineer("Lisa", 28, "Senior", 7000)
se3 = SoftwareEngineer("Lisa", 28, "Senior", 7000)
se1.coding()
se2.coding_language("Python")
se1.coding_language("C")
print(se2.information())
# print(se1) printing with information method
print(se1)  # Printing with __str__(self) method
# print(se2 == se3) # Prints false as it is comparing the memory locations
print(se2 == se3)  # Prints true as it is comparing the data in se2 and se3 using the __eq__(self, other) method
print(se2.entry_salary(se2.age))
print(SoftwareEngineer.entry_salary(60))

# Recap
# Created instance methods (Using the self parameter)
# Methods that can take arguments and return values
# Using special dunder methods -> (__init__(self), __str__(self) and __eq__(self, other))
# Using @staticmethod which doesn't require self to be passed as an argument

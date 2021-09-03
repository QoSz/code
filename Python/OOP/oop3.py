# Inheriting, Extending and Overriding

class Employee:

    def __init__(self, name, age, salary):
        self.name = name
        self.age = age
        self.salary = salary

    def working(self):
        print(f"{self.name} is working...")


class SoftwareEngineer(Employee):
    # Overriding the init function(method)
    def __init__(self, name, age, salary, level):
        super().__init__(name, age, salary)
        self.level = level

    # Overriding
    def working(self):
        print(f"{self.name} is coding...")

    # Extending
    # Only available to this class
    def debug(self):
        print(f"{self.name} is debugging...")


class Designer(Employee):
    # Overriding
    def working(self):
        print(f"{self.name} is designing...")

    # Extending
    def draw(self):
        print(f"{self.name} is drawing...")


se = SoftwareEngineer("Yash", 19, 30_000, "Senior")
# print(se.level)
# se.working()
# se.debug()
d = Designer("Keyul", 22, 50_000)
# d.working()
# d.draw()
# se.draw() -> You will get an error running this code as a method within a class in only available to that class and
# not another class

# Polymorphism
employees = [SoftwareEngineer("Yash", 19, 30_000, "Senior"),
             SoftwareEngineer("Lisa", 19, 15_000, "Junior"),
             Designer("Keyul", 23, 50_000)]


def motivation(employee_list):
    for employee in employee_list:
        employee.working()


motivation(employees)

# Recap
# Inheritance using a child class(Sub class) which inherits from the parent class(Base class)
# Inherit, Extend, and Override
# Overriding init method in child class using super().__init__(self)
# Polymorphism

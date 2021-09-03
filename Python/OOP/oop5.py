# Encapsulation, Abstraction
# Pythonic way of using getters and setters

class SoftwareEngineer:

    def __init__(self):
        self._salary = None

    # Getter -> Used to access/get private variables
    @property
    def salary(self):
        return self._salary

    @salary.setter
    def salary(self, value):
        self._salary = value


se = SoftwareEngineer()

se.salary = 6000
print(se.salary)

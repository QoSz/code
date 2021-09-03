# Encapsulation, Abstraction

class SoftwareEngineer:
    # Initializer function. The _ before a variable it to show it is a \
    # protected functions and a double __ shows its a private variable.
    def __init__(self, name, age):
        self.name = name
        self.age = age
        self._salary = None
        self._bugs_resolved = 0

    # Getter -> Used to access/get private variables
    def get_salary(self):
        return self._salary

    def get_bugs_resolved(self):
        return self._bugs_resolved

    # Setter -> Used to check values or enforce constraints
    def set_salary(self, base_value):
        self._salary = self._calculate_salary(base_value)

    # Incrementing bugs solved
    def coding(self):
        self._bugs_resolved += 1

    # Creating constraints for the setter method
    def _calculate_salary(self, base_value):
        if self._bugs_resolved < 10:
            return base_value
        if self._bugs_resolved < 100:
            return 2 * base_value
        return 3 * base_value


se = SoftwareEngineer("Yash", 19)
print(se.name, se.age)
for i in range(50):
    se.coding()
print(f"Number of bugs solved was {se.get_bugs_resolved()}")

se.set_salary(1000)
print(f"Therefore {se.name}'s salary is {se.get_salary()}")

# Key notes
# Dont access protected and private variables from outside the class without getters and setters
# Setters -> Are used to manipulate values without knowing the internals of the code
# Getter -> Used to get values of private or protected values
# One _ -> Used to represent a protected variable (Used before the variable name)
# Double __ -> Used to represent a private variable (Used before the variable name)

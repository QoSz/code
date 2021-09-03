income = [10, 30, 75]
income_double = []

"""
It is shorter and easier to use list(map()) 
as you dont need to use any loops or declare any variables.
"""


# Double values in the array using a function
def double_money(dollars):
    return dollars * 2


for i in income:
    income_double.append(double_money(i))
print(income_double)

# Doubling values using the map function.
new_double = list(map(double_money, income))
print(new_double)

# Unpacking items from a list
# Each item can be assigned to an individual variable
dob, name, age = ['1st December 2001', 'Yash Shah', '19']
print(dob)
print(name)
print(age)


# Dropping the first and last grades and only using the middle grades to calculate the average grade
def calculating_average_grade(grade):
    first, *middle, last = grade
    average = sum(middle) / len(middle)
    print(average)


calculating_average_grade([1, 2, 3, 4, 5, 6, 7, 8])

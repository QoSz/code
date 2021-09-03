def gender(sex="Unknown"):
    if sex == "m" or sex == "M":
        sex = "Male"
    elif sex == "f" or sex == "F":
        sex = "Female"
    return sex


def description(name="No name", age="No age", sex=gender()):
    print(f"Your name is {name}, you are {age} years old and your gender is {sex}")


def health_calculator(age, apples_ate, cigs_smoked):
    return (100 - age) + (apples_ate * 3.5) - (cigs_smoked * 2)


def main():
    description("Yash Shah", "19", gender("M"))
    keyul = [22, 1, 2]
    yash = [19, 2, 4]
    print(health_calculator(*keyul))
    print(health_calculator(*yash))


if __name__ == "__main__":
    main()

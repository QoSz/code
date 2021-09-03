def add(a=1, b=10):
    return a + b


def factorialaddition(n):
    return int((pow(n, 2) + n) / 2)


def pizza():
    return "I love eating pizza"


def ageallowedtodate(age):
    return (age / 2) + 7


def get_gender(sex='Unkown'):
    if sex == 'm':
        sex = 'Male'
    elif sex == 'f':
        sex = 'Female'
    print(sex)


def main():
    creepy_joe = ageallowedtodate(41)
    add(4, 3)
    factorialaddition(5)
    pizza()
    f"Creepy joe can only date {creepy_joe} or older"
    get_gender("m")


if __name__ == '__main__':
    main()

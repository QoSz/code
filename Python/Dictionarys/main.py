def main():
    foods = {
        "Banana": 12,
        "Apples": 3,
        "Oranges": 2,
        "Avocado": 1
    }

    print(foods)
    print(foods["Apples"])

    for k, v in foods.items():
        print(f"{k} {v}")


if __name__ == '__main__':
    main()

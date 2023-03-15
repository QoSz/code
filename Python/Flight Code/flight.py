def main(n):
    tickets = [i for i in range(n)]
    tickets_split = []

    print("Breakup 1")
    print(*tickets)
    for i in range(1, n + 1):
        print(f"Breakup {i+1}")
        tickets_split.insert(0, tickets.pop())
        if tickets == []:
            for i in tickets_split:
                print(i)
        else:
            print(*tickets)
            print(*tickets_split)


if __name__ == "__main__":
    # run the code until a valid input is given
    while True:
        try:
            n = int(float(input("Enter number of tickets: ")))
            main(n)
            break
        except ValueError:
            print("Please enter a valid integer number")

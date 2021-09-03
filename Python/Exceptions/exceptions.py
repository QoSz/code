answer = int(input("What is you favorite number: \n"))

while True:
    try:
        if answer == 0:
            print(0)
        else:
            print(100 / answer)
            break
    except ValueError:
        print("please enter an integer")
    except SyntaxError:
        print("Dont enter any other character only enter integers")
    finally:
        print("Loop ended \n")
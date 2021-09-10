import threading

n = 1000000


def function1():
    for i in range(n):
        print("One")


def function2():
    for i in range(n):
        print("Two")


t1 = threading.Thread(target = function1)
t2 = threading.Thread(target= function2)

t1.start()
t2.start()

import time

# print("Hello World!")

def hello():
    cdef str a = input("What is you name? ")
    print(f"Hello {a}")

def addingnumbers(double a, double b):
    return a + b

def isevennumber(int x):
    if x % 2 == 0:
        print("Is an even number")
    else:
        print("Is an odd number")

def isPrime(int n):
    if n <= 1:
        return False

    cdef int i

    for i in range(2, n):
        if n % i == 0:
            return False

    return True

def Fibonacci(int n):
    if n < 0:
        print("Incorrect input")
    elif n == 0:
        return 0
    elif n == 1 or n == 2:
        return 1
    else:
        return Fibonacci(n - 1) + Fibonacci(n - 2)

start = time.time()
cdef int i
for i in range(40):
    print(Fibonacci(i))
stop = time.time()
print(stop - start)
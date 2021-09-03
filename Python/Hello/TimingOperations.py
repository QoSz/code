import time

start = time.time()

1000000 ** 1000000

end = time.time()
print(f"Time is: {end - start}")

start2 = time.time()

pow(1000000, 1000000)

end2 = time.time()
print(f"Time is: {end2 - start2}")


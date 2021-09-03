import time
import add_

n = 100000

start_c = time.time()
print(add_.summation(n))
end_c = time.time()
print(f"Time for cython was: {end_c - start_c}")

start_py = time.time()
print(add_.summation_py(n))
end_py = time.time()
print(f"Time for python was: {end_py - start_py}")

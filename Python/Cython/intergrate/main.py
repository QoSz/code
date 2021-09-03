import time
from num import integrate_f

start = time.time()
print(integrate_f(1.0, 10.0, 2000))
stop = time.time()
print(f"{stop - start}")

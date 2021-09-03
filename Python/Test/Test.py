import numpy as np
import time

n = 10

start_time = time.time()
arr = np.sum(np.arange(n + 1))
print(arr)
stop_time = time.time()
print((stop_time - start_time) * 1000)

start_time2 = time.time()
print(int((pow(n, 2) + n) / 2))
stop_time2 = time.time()
print((stop_time2 - start_time2) * 1000)

start_time3 = time.time()
print(sum(range(n + 1)))
stop_time3 = time.time()
print((stop_time3 - start_time3) * 1000)
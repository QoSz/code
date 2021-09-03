import animals as a
import time

a.tuna()
a.lion()
a.addtwonumbers()

start = time.time()
a.compare1()
stop = time.time()
print((stop - start) * 10000)

start_t1 = time.time()
a.compare2()
stop_t1 = time.time()
print((stop_t1 - start_t1) * 10000)
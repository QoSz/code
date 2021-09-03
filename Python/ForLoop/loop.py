import time

start_time = time.time()

with open("test.txt", "r") as f:
    data = f.read().splitlines()

for i in data:
    print(i)

end_time = time.time()
print(end_time - start_time)

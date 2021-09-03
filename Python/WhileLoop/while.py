import time

while_start = time.time()
i = 0
while i < 100:
    print(i, end=" ")
    i += 1
while_end = time.time()

for_start = time.time()
for i in range(100):
    print(i, end=" ")
for_end = time.time()

print("\n")
print(f"Time taken for while loop is {(while_end - while_start) * 100000}")
print(f"Time taken for for loop is {(for_end - for_start) * 100000}")

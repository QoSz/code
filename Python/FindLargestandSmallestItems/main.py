import heapq
import random

a = []
for i in range(10):
    b = random.randint(1, 100)
    a.append(b)

top_3_grades = heapq.nlargest(3, a)
print(top_3_grades)

stocks = [
    {'ticker': 'APPL', 'price': 201},
    {'ticker': 'GOOG', 'price': 800},
    {'ticker': 'F', 'price': 54},
    {'ticker': 'MSFT', 'price': 313},
    {'ticker': 'TUNA', 'price': 86},
]

top_2_stocks = heapq.nlargest(2, stocks, key=lambda stock: stock['price'])
print(top_2_stocks)
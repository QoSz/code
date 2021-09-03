stocks = {
    'GOOG': 512.16,
    'APPL': 120.83,
    'AMZN': 274.73,
    'FB': 148.61,
    'SMSNG': 142.29
}

print("Min price")
print(min(zip(stocks.values(), stocks.keys())))

print("==========================")

print("Max price")
print(max(zip(stocks.values(), stocks.keys())))

print("==========================")

print("Sorted list in terms of price")
print(sorted(zip(stocks.values(), stocks.keys())))
print("==========================")


print("==========================")

print("Sorted list in terms of name (Alphabetical order)")
print(sorted(zip(stocks.keys(), stocks.values())))
print("==========================")

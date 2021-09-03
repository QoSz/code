stocks = {
    'GOOG': 446,
    'APPL': 231,
    'FB': 54,
    'AMZN': 623,
    'F': 32,
    'MSFT': 121
}

min_price = min(zip(stocks.values(), stocks.keys()))
print(min_price)

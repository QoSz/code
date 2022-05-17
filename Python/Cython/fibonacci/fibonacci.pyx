def fibonacci_(int n):
    if n == 1 or n == 2:
        return 1
    else:
        result = fibonacci_(n - 1) + fibonacci_(n - 2)
        return result
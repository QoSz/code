def fact_cy(int n):
    cdef int i, ret
    ret = 1
    for i in range(n):
        ret *= n
    return ret

def bench_cy():
    for i in range(1000):
        fact_cy(5000)


def fact_py(n):
    ret = 1
    for _ in range(n):
        ret *= n
    return ret

def bench_py():
    for _ in range(1000):
        fact_py(5000)
import threading


class YashMessanger(threading.Thread):
    def run(self):
        for _ in range(10):
            print(threading.currentThread().getName())


x = YashMessanger(name="Send out message")
y = YashMessanger(name="Receive message")
x.start()
y.start()

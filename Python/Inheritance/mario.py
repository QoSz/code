class Mario:
    @staticmethod
    def move():
        print("I am moving!")


class Shroom:
    @staticmethod
    def eat_shroom():
        print("Now I am big!")


class Bigmario(Mario, Shroom):
    @staticmethod
    def flower():
        print("I can now shoot fire")


bm = Bigmario()
bm.move()
bm.eat_shroom()
bm.flower()

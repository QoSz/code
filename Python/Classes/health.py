import random

class Monster:
    life = 78

    def attack(self):
        if 0 < self.life <= 100:
            self.life -= 1
        # print("Ouch")

    def checkhealth(self):
        if self.life == 0:
            print("You are dead.")
        elif 0 < self.life <= 100:
            print(f"Health is {self.life}%")

    def regainhealth(self):
        if self.life < 100:
            self.life += 2


def main():
    enemy = Monster()

    print("Health before")

    enemy.checkhealth()

    print("Attacking enemy")

    for i in range(random.randint(0, 100)):
        enemy.attack()

    enemy.checkhealth()

    print("Regaining health")

    for i in range(random.randint(0, 20)):
        enemy.regainhealth()

    enemy.checkhealth()


main()

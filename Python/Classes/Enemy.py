class Enemy:
    def __init__(self, x):
        self.energy = x

    def get_energy(self):
        print(self.energy)


jason = Enemy(80)
natasha = Enemy(92)

jason.get_energy()
natasha.get_energy()

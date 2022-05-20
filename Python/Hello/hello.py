class Hello():
    def __init__(self, name):
        self.name = name

    def say(self):
        return f"Hello, {self.name}"


yazh = Hello("Yazh")
print(yazh.say())

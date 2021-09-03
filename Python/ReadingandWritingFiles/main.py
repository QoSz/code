with open("hello.txt", "w") as f:
    f.write("Hello my name is Yash Shah\n")
    f.write("I am 19 years old")
    f.close()

with open("hello.txt", "r") as f:
    print(f.read())
    f.close()
from PIL import Image

img = Image.open("emma.jpg")

square = img.resize((920, 800))

square.show()
from PIL import Image

elephant = Image.open("elephant.jpg")
purpule = Image.open("purple.jpg")

area = (100, 100, 787, 787)
purpule.paste(elephant, area)

purpule.show()

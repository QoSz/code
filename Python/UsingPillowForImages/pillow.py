from PIL import Image

img = Image.open('emma.jpg')
area = (900, 400, 10000, 10075)
cropped_image = img.crop(area)

# img.show()
cropped_image.show()
from PIL import Image

# Splitting colors into their separate channels.
purple = Image.open("purple.jpg")
r, g, b = purple.split()

r.show()
g.show()
b.show()
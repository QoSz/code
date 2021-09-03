import random
import urllib.request


def downloadimage(url):
    name = random.randrange(1, 1000)
    full_name = str(name) + ".jpg"
    urllib.request.urlretrieve(url, full_name)


downloadimage("https://www.mandysam.com/img/random.jpg")

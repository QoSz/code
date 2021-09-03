import requests
from bs4 import BeautifulSoup
import operator


def start(url):
    word_list = []

    source_code = requests.get(url).text
    soup = BeautifulSoup(source_code, "html.parser")
    for post_text in soup.findAll("h3", {"class": "name"}):
        content = post_text.string
        words = content.lower().split()
        for each_word in words:
            # print(each_word)
            word_list.append(each_word)
    clean_up_wordlist(word_list)


def clean_up_wordlist(x):
    clean_wordlist = []
    for word in x:
        symbols = "!£$%^&*()-=+_{}:@~<>?[];'\"#,./\\|"
        for i in range(len(symbols)):
            word = word.replace(symbols[i], "")
        if len(word) > 0:
            # print(word)
            clean_wordlist.append(word)
    create_dictionary(clean_wordlist)


def create_dictionary(y):
    word_count = {}

    for word in y:
        if word not in word_count:
            word_count[word] = y.count(word)

    for key, value in sorted(word_count.items(), key=operator.itemgetter(1)):
        print(key, value)


start("https://www.jumia.co.ke/mlp-col-refurb-shop/")

import requests
from bs4 import BeautifulSoup


def main():
    # Get the data
    data = requests.get('https://www.cloudflarestatus.com/')

    # Load the data into bs4
    soup = BeautifulSoup(data.text, 'html.parser')

    # Get data for Kenya only
    for div in soup.findAll('div', {"data-component-id": "ljllh1921z0m"}):
        values = [span.text for span in div.find_all('span')]
        for i in values:
            print(i.strip())

    # Get data for each country
    # for div in soup.findAll('div', {"class": "component-inner-container"}):
    #     values = [span.text for span in div.find_all('span')]
    #     for i in values:
    #         print(i.strip().replace("?", ""))


if __name__ == '__main__':
    main()

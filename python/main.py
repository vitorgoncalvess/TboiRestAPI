from urllib.request import urlopen
from bs4 import BeautifulSoup

url = "https://platinumgod.co.uk/all-items"
page = urlopen(url)
html_bytes = page.read()
html = html_bytes.decode("utf-8")
soup = BeautifulSoup(html, "html.parser")

string = soup.get_text()
string = string.split("\n")

new_list = [x for x in string if x != '']
del new_list[0:78]
del new_list[10194:len(new_list)]

class Item(name, resume, desc, type, itemPool):
    this.name = name;


print(new_list)

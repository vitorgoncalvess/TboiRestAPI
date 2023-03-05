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
del new_list[8212:len(new_list)]

for i in new_list:
    i = i.replace("* ", "")
    i = i.replace("*", "")
    i = i.replace('"', '')
    print(i)
from bs4 import BeautifulSoup

html_doc = "<html><head><title>Test Page</title></head><body><h1>Hello, world!</h1></body></html>"
soup = BeautifulSoup(html_doc, 'html.parser')

print(soup.prettify())

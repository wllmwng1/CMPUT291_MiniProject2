
from bsddb3 import db
import re

def term(title,desc):
    f = open('term.txt','w+')
    title = re.split(r'[^0-9a-zA-Z_-]',title.lower())
    print(title)

term('Test.','Test.')

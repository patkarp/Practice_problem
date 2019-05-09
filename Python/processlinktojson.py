
# Write a program to call an API and fetch employee data in JSON format from the API, print it in indented or tabular format.
# 
# API = http://jsonplaceholder.typicode.com/users
# 
# --------------------
# JSON Object example:
# --------------------
# [
#   {
#     "id": 1,
#     "name": "Leanne Graham",
#     "username": "Bret",
#     "email": "Sincere@april.biz",
#     "address": {
#       "street": "Kulas Light",
#       "suite": "Apt. 556",
#       "city": "Gwenborough",
#       "zipcode": "92998-3874",
#       "geo": {
#         "lat": "-37.3159",
#         "lng": "81.1496"
#       }
#     },
#     "phone": "1-770-736-8031 x56442",
#     "website": "hildegard.org",
#     "company": {
#       "name": "Romaguera-Crona",
#       "catchPhrase": "Multi-layered client-server neural-net",
#       "bs": "harness real-time e-markets"
#     }
#   },
#   {
#     "id": 2,
#     "name": "Neil Armstrong",
#     "username": "Neil",
#     "email": "Sincerely@april.biz",
#     "address": {
#       "street": "Kuala Light",
#       "suite": "Apt. 456",
#       "city": "London",
#       "zipcode": "92000-3874",
#       "geo": {
#         "lat": "-36.3159",
#         "lng": "89.1496"
#       }
#     },
#     "phone": "1-408-736-8031 x1111",
#     "website": "wiki.org",
#     "company": {
#       "name": "Some-Crona",
#       "catchPhrase": "Something",
#       "bs": "stock"
#     }
#   },
# ......
# ......
# ]
# ---------------
# Desired output:
# ---------------
# Leanne Graham 41-770-736-8031 x56442 Sincere@april.biz
# 
# Neil Armstrong 1-408-736-8031 x1111 Sincerely@april.biz
# ----------------------
# Running Instruction: 
#------------------------- 
#python3 processlinktojson.python
#
import requests
import pprint
import json
class JsonProcess:
    r = requests.get('http://jsonplaceholder.typicode.com/users')
    p = json.loads(r.text)
    pp = pprint.PrettyPrinter(indent = 4)
    #print(p)
    for i in p:
        name = i['name']
        phone = i['phone']
        email = i['email']      
        pp.pprint(name + "  "  + phone + "  " + email)

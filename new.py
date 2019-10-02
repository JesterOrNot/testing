import json
import math
dict1 = {}
z = 2**2 + 5 + math.sqrt(16)
v = "Hello world from JSON"
dict1.update({"z":z})
dict1.update({"Hello":v})
with open("new.json",'w+') as write_file:
    json.dump(dict1,write_file,indent=4)
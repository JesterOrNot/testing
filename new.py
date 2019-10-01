import json
x = {"hello":33,"new":2019}
with open("new.json",'w+') as write_file:
    json.dump(x,write_file,indent=4)
with open("new.json","r") as read_file:
    data = json.load(read_file)
z = data.get("hello")
b = data.get('new')
print(z)
print(b)
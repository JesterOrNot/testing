import fileinput
z = []
for line in fileinput.input("x.txt"):
    z.append(line.rstrip())
v = [list(i) for i in z]
v = [[i for i in v[i] if i != ","] for i in range(0,len(v))]
print(v)
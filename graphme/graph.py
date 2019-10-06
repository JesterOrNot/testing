import matplotlib.pyplot as plt
import os
import fileinput
z = []
for line in fileinput.input("stdin.txt"):
    z.append(line.rstrip())
v = [list(i) for i in z]
v = [[i for i in v[i] if i != ","] for i in range(0,len(v))]
x = v[0]
y = v[1]
x = [float(i) for i in x]
y = [float(i) for i in y]
plt.plot(x,y)
plt.savefig("S.png")
os.system("mv S.png images")
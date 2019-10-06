import matplotlib.pyplot as plt
import os
import fileinput

def graph():
    z = []
    for line in fileinput.input("stdin.txt"):
        z.append(line.rstrip())
    z1 = z[0]
    z2 = z[1]
    x = z1.split(",")
    y = z2.split(",")
    x = [float(i) for i in x]
    y = [float(i) for i in y]
    plt.plot(x,y)
    plt.savefig("graph.png")
    os.system("mv graph.png images")

graph()

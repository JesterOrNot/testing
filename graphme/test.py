import matplotlib.pyplot as plt
import os
x = [1,2,3]
y = [2,4,6]
plt.plot(x,y)
plt.savefig("S.png")
os.system("mv S.png images")
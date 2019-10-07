javac Main.java
python3 clear.py
read -p "What are the x coords?: " z
read -p "What are the y coords?: " v
echo $z &>> stdin.txt
echo $v &>> stdin.txt
java Main
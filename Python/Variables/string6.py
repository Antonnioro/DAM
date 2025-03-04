fraseNormal = input("Mete una frase: ")
contador = 0
x = 0

frase = fraseNormal.lower()

while x < len(frase):
    if frase[x] == "a" or frase[x] == "e" or frase[x] == "i" or frase[x] == "o" or frase[x] == "u":
        contador+=1
    x+=1
print(contador)
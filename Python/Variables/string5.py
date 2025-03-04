x = 0
contador = 0
frase = input("Introduce una frase: ")

while x < len(frase):
    if frase[x] == " ":
        contador+=1
    x+=1
print(f"La cantidad de espacios en la frase es {contador}")
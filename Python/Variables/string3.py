email = input("Mete una cadena: ")
x = 0
contador = 0

while x < len(email):
    if email[x] == "@":
        contador+=1
    x+=1

print(contador)
    
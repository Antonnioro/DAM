x = 1
pares = 0
impares = 0
numero = int(input("¿Cuantos numeros vas a meter? "))

while x<=numero:
    valor=int(input("Mete el numero: "))
    if valor%2==0:
        pares+=1
    else:
        impares+=1
    x+=1

print(f"Cantidad de pares {pares}")
print(f"Cantidad de impares {impares}")
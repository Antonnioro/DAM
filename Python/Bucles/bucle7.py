negativos = 0
positivos = 0
multiplos = 0
pares = 0

for i in range(10):
    valores = int(input("Mete un valor: "))

    if valores < 0:
        negativos+=1
    if valores > 0:
        positivos+=1
    if valores%15 == 0:
        multiplos+=1
    if valores%2 == 0:
        pares = pares + valores

print(f"Cantidad de numeros negativos: {negativos}")
print(f"Cantidad de numeros positivos: {positivos}")
print(f"Cantidad de numeros múltiplos de 15: {multiplos}")
print(f"Suma de los pares: {pares}")
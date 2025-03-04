cantidad = 0
n = int(input("Valores que vas a meter: "))

for i in range(n):
    numero = int(input("Mete un numero: "))

    if numero >= 1000:
        cantidad+=1

print(f"La cantidad de numeros mayores o iguales a 1000 es: {cantidad}")
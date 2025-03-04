sueldos=[]
suma = 0

for x in range(5):
    valor=float(input("Mete los sueldos: "))
    sueldos.append(valor)
    suma+=valor

promedios = suma/5

print(f"Lista de sueldos: {sueldos}")
print(f"Promedio de sueldos: {promedios}")

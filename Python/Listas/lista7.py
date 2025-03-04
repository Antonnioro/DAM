lista=[]

numero=int(input("Mete un numero: "))

while numero!=0:
    lista.append(numero)
    numero=int(input("Mete un numero: "))

print(lista)
print(f"Tamano de la lista: {len(lista)}")
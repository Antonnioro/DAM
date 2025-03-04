def ejercicio():
    lista=[]
    for i in range(5):
        lista.append(int(input("Mete un valor: ")))

    mayor = lista[0]
    menor = lista[0]

    for i in range(len(lista)):
        if lista[i] >= mayor:
            mayor = lista[i]
        else:
            if lista[i] <= menor:
                menor = lista[i]
    return (menor, mayor)

menormayor = ejercicio()

menor, mayor = menormayor

print("El valor más alto de la lista es:", mayor)
print("El valor más bajo de la lista es:", menor)

print(menormayor)
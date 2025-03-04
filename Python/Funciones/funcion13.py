lista=[2, 222, 23, 11, 3]

def producto(lista,multiplicador):
    nuevaLista = []
    for x in range(len(lista)):
        nuevaLista.append(lista[x]*multiplicador)
    return nuevaLista

numero = int(input("Dame un numero: "))

miNuevaLista = producto(lista, numero)
print(lista)
producto(miNuevaLista)
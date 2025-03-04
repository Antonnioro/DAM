def cargar():
    lista=[]
    for i in range(10):
        valor = int(input("Mete un valor: "))
        lista.append(valor)
    return lista

def imprimir(lista):
    for i in range(len(lista)-1):
        print(lista[i], end=", ")
    print(lista[9])

lista = cargar()
imprimir(lista)
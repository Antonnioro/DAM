def datos():
    numeros=[]

    for i in range(10):
        numero = int(input("Mete un numero: "))
        numeros.append(numero)

    return numeros

def separador(numeros):
    negativos=[]
    positivos=[]
    for i in range(len(numeros)):
        if numeros[i]<0:
            negativos.append(numeros[i])
        elif numeros[i]>0:
            positivos.append(numeros[i])
    return [negativos,positivos]

def imprimir(numeros):
    print(numeros)


numeros=datos()
negativos,positivos=separador(numeros)
print("Lista con los valores negativos")
imprimir(negativos)
print("Lista con los valores positivos")
imprimir(positivos)

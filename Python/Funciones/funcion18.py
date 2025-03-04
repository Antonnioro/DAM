def tres_numero():
    numero1 = int(input("Dame un número: "))
    numero2 = int(input("Dame un número: "))
    numero3 = int(input("Dame un número: "))
    return[numero1, numero2, numero3]

lista = tres_numero()

miPrimerNumero = lista[0]
print(miPrimerNumero)
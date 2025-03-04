def tabla(numero, termino = 10):
    for i in range(1, termino + 1):
        valor = numero * i
        print(f"{numero} * {i} = {valor}")


tabla(7)
print()
tabla(numero = 7, termino = 5)
def edades(e1, *lista):
    lista_mayores = []
    if e1 >= 18:
        lista_mayores.append(e1)
    for edad in range(len(lista)):
        if lista[edad] >= 18:
            lista_mayores.append(lista[edad])
    print(lista_mayores)

edades(67)

edades (76, 54)

edades(14, 21, 15, 89)
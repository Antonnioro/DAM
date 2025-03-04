def contar(textoNormal):
    contador = 0
    texto = textoNormal.lower()
    for x in range(len(texto)):
        if texto[x] == "a" or texto[x] == "e" or texto[x] == "i" or texto[x] == "o" or texto[x] == "u":
            contador += 1
    print("Cantidad de vocales de la palabra", texto, "es", contador)

contar("Adios")
contar("Hola")
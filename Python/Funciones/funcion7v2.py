def contar(texto):
    contador = 0
    for x in range(len(texto)):
        if texto[x] in "aeiouüAEIOUÜáéíóúÁÉÍÓÚ":
            contador += 1
    print("Cantidad de vocales de la palabra", texto, "es", contador)

cadena = input("Escribe lo que sea: ")
contar(cadena)
def cargar():
    diccionario={}
    continuar="s"
    while continuar == "s":
        castellano = input("Mete la palabra en castellano: ")
        ingles = input("Mete la palabra en inglés: ")

        diccionario[ingles] = castellano
        continuar = input("Quieres meter otra palabra? [s/n]")
    return diccionario

def imprimir(diccionario):
    print("Listado completo del diccionario")
    for ingles in diccionario:
        print("La traducción de",ingles, "es",diccionario[ingles])

def consultarPalabra(diccionario):
    palabra = input("Mete la palabra en inglés a consultar: ")
    if palabra in diccionario:
        print("En español, esa palabra es:",diccionario[palabra])

diccionario = cargar()
imprimir(diccionario)
consultarPalabra(diccionario)
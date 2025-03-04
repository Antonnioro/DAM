def cargar():
    personas={}
    for x in range(4):
        numero=input("Mete el numero de documento: ")
        nombre=input("Mete el nombre: ")
        personas[numero]=nombre
    return personas

def imprimir(personas):
    print("Listado del diccionario completo")
    for numero in personas:
        print(numero, personas[numero])

def consultaPorNumero(personas):
    numero=int(input("Mete el numero de documento a consultar: "))
    if numero in personas:
        print("Nombre de la persona:",personas[numero])
    else:
        print("No existe una persona con dicho numero")

personas = cargar()
imprimir(personas)
consultaPorNumero(personas)
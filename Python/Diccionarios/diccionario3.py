def cargar():
    productos={}
    for i in range(5):
        nombre=input("Mete el nombre del producto: ")
        precio=int(input("Mete el precio: "))
        productos[nombre]=precio
    return productos

def imprimir(productos):
    print("Lista de todos los productos")
    for nombre in productos:
        print(nombre, productos[nombre])

def imprimirMayor100(productos):
    print("Lista de artículos con precio mayor a 100")
    for nombre in productos:
        if productos[nombre]>100:
            print(nombre)

productos = cargar()
imprimir(productos)
imprimirMayor100(productos)
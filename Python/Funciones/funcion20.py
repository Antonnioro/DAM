def cargar_datos():
    articulos=[]
    precios=[]

    for i in range(5):
        articulo = input("Mete el nombre del artículo: ")
        articulos.append(articulo)
        precio = float(input("Mete el precio del artículo: "))
        precios.append(precio)
    return[articulos, precios]

def imprimir(articulos, precios):
    print("Listado completo de artículos y sus precios")
    for i in range(len(articulos)):
        print(articulos[i], precios[i])

def precio_mayor(articulos, precios):
    mayor = precios[0]
    posicion = 0

    for i in range(1, len(precios)):
        if precios[i] > mayor:
            mayor = precios[i]
            posicion = i
    print("El artículo con el mayor precio es:",articulos[posicion],"su precio es:",mayor)

def consulta_precio(articulos, precios):
    valor=int(input("Mete el importe para mostrar los artículos más baratos "))

    for i in range(len(precios)):
        if precios[i] < valor:
            print(articulos[i], "=", precios[i])

articulos,precios=cargar_datos()
imprimir(articulos,precios)
precio_mayor(articulos,precios)
consulta_precio(articulos,precios)
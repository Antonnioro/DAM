def cargar_listas():
    productos = []
    precios = []
    
    for i in range(5):
        producto = input("Producto: ")
        precio = float(input("Precio: "))
        productos.append(producto)
        precios.append(precio)
    return[productos, precios]


def imprimir(lista):
    print(lista)
    
def el_mas_caro(productos, precios):
    precio_mas_caro = 0
    producto_mas_caro = ""
        
    for i in range(5):
        if precios[i] > precio_mas_caro:
            precio_mas_caro = precios[i]
            producto_mas_caro = productos[i]
    return [producto_mas_caro, precio_mas_caro]

def productos_baratos(precios, productos):
    limite = int(input("Dame el precio límite: "))
    for i in range(5):
        if precios[i] < limite:
            print(f"El producto {productos[i]} es más barato que {limite}")


listas = cargar_listas()
lista_productos = listas[0]
lista_precios = listas[1]

print("Lista de productos")
imprimir(lista_productos)

print("Lista de precios")
imprimir(lista_precios)

mi_producto_mas_caro = el_mas_caro(lista_productos, lista_precios)
producto_mas_caro = mi_producto_mas_caro[0]
precio_mas_caro = mi_producto_mas_caro[1]

productos_baratos(lista_precios, lista_productos)
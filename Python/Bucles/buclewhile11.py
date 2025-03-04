cantidad = int(input("Piezas a procesar: "))
x = 1
numero = 0

while x <= cantidad:
    longitud = float(input("¿Cuanto mide la pieza? "))
    if longitud >= 1.2 and longitud <= 1.3:
        numero+=1
    x+=1

print(f"El numero de piezas aptas es: {numero}")

def retornar_superficie(lado):
    sup=lado*lado
    return sup

va=int(input("Ingrese el valor del lado del cuafrado:"))
superficie=retornar_superficie(va)
print("La superficie del cuadrado es",superficie)
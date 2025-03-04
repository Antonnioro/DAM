def calcular_sueldo(nombre, costehora, cantidadhoras):
    sueldo = costehora*cantidadhoras
    print(nombre, "trabaja", cantidadhoras,"horas y cobra un sueldo de",sueldo,"€")

calcular_sueldo("Juan", 10, 120)
calcular_sueldo(costehora=12, cantidadhoras=40,nombre="Ana")
calcular_sueldo(cantidadhoras=90, nombre="Luís", costehora=7)
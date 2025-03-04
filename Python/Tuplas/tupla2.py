def cargarFecha():
    dia = int(input("Introduce el día: "))
    mes = int(input("Introduce el mes: "))
    año = int(input("Introduce el año: "))

    return (dia, mes, año)

def imprimirFecha(fecha):
    print(fecha[0], fecha[1], fecha[2], sep="/")

fecha = cargarFecha()
imprimirFecha(fecha)
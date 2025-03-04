def cargar_sueldos():
    sueldos=[]

    for i in range(10):
        sueldo = int(input("Mete el sueldo: "))
        sueldos.append(sueldo)
    return sueldos

def imprimir_sueldos(sueldos):
    print("Listado de sueldos.")

    for i in range(len(sueldos)):
        print(sueldos[i])

def sueldos_mayor_4000(sueldos):
    cantidad = 0

    for i in range(len(sueldos)):
        if sueldos[i] > 4000:
            cantidad += 1
    print("Numero de empleados con un sueldo por encima de 4000:",cantidad)

def promedio(sueldos):
    suma = 0

    for i in range(len(sueldos)):
        suma += sueldos[i]
    media = suma/10
    return media

def sueldos_bajos(sueldos, media):
    promedio = media(sueldos)

    print("Sueldo medio de la empresa:",promedio)
    print("Sueldos inferiores al promedio:")

    for i in range(len(sueldos)):
        if sueldos[i] < promedio:
            print(sueldos[i])

sueldos=cargar_sueldos()
imprimir_sueldos(sueldos)
sueldos_mayor_4000(sueldos)
sueldos_bajos(sueldos, promedio)
def cargar():
    empleados={}
    continua="s"
    while continua == "s":
        legajo = int(input("Mete el numero de legajo: "))
        nombre = input("Mete el nombre del empleado: ")
        profesion = input("Mete el nombre de la profesión: ")
        sueldo = float(input("Mete el suelod: "))

        empleados[legajo] = [nombre, profesion, sueldo]
        continua = input("Quieres meter los datos de otro empleado? [s/n]: ")
    return empleados

def imprimir(empleados):
    for legajo in empleados:
        print(legajo,empleados[legajo][0], empleados[legajo][1], empleados[legajo][2])

def modificarSueldo(empleados):
    legajo = int(input("Mete el numero de legajo para buscar: "))
    if legajo in empleados:
        sueldo = float(input("Mete el nuevo sueldo: "))
        empleados[legajo][2] = sueldo
    else:
        print("No existe un empleado con dicho número")

def imprimirAnalistas(empleados):
    print("Listado de pringaos con la profesión 'Analista de Sistemas'")

    for legajo in empleados:
        if empleados[legajo][1] == "Analista de Sistemas":
            print(legajo, empleados[legajo][0], empleados[legajo][2])

empleados = cargar()
imprimir(empleados)
modificarSueldo(empleados)
imprimir(empleados)
imprimirAnalistas(empleados)
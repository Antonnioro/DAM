def cargar():
    empleados = []

    for x in range(5):
        nombre = input("Mete el nombre del empleado: ")
        sueldo=int(input("Sueldo: "))
        empleados.append((nombre,sueldo))
    return empleados

def imprimir(empleados):
    for nombre,sueldo in empleados:
        print(nombre, sueldo)

def mayorSueldo(empleados):
    empleado = empleados[0]

    for emp in empleados:
        if emp[1]>empleado[1]:
            empleado = emp
    print("Empleado con mayor sueldo:",empleado[0],"su sueldo es",empleado[1])

def sueldoMenor1000(empleados):
    cantidad = 0
    for empleado in empleados:
        if empleado[1]<1000:
            cantidad += 1
    print("Cantidad de empleados con un sueldo menor a 1000 son:",cantidad)

empleados = cargar()
imprimir(empleados)
mayorSueldo(empleados)
sueldoMenor1000(empleados)
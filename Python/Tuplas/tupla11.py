def cargarEmpleados():
    empleados=[]

    for x in range(5):
        nombre = input("Mete el nombre del empleado: ")
        sueldo1=int(input("Primer sueldo: "))
        sueldo2=int(input("Segundo sueldo: "))
        sueldo3=int(input("Tercer sueldo: "))
        empleados.append([nombre,(sueldo1, sueldo2, sueldo3)])
    return empleados

def ganancias(empleados):

    for x in range(5):
        total = empleados[x][1][0] + empleados[x][1][1] + empleados[x][1][2]
        print(empleados[x][0], total)

def masDe10000(empleados):
    print("Empleados que son muy ricos")

    for x in range(5):
        total = empleados[x][1][0] + empleados[x][1][1] + empleados[x][1][2]
        if total>10000:
            print(empleados[x][0], total)

empleados = cargarEmpleados()
ganancias(empleados)
masDe10000(empleados)
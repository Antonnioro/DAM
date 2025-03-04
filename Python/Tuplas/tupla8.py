def cargarEmpleado():
    nombre = input("Mete el nombre del empleado: ")
    sueldo = float(input("Mete el sueldo de dicho empleado: "))

    return (nombre,sueldo)

def mayorSueldo(e1, e2):
    if e1[1]>e2[1]:
        print(e1[0],"tiene mayor sueldo")
    elif e1[1] == e2[1]:
        print("Ambos tienen el mismo sueldo")
    else:
        print(e2[0],"tiene mayor sueldo")

e1=cargarEmpleado()
e2=cargarEmpleado()

mayorSueldo(e1,e2)
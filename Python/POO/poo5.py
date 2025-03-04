class Empleado:

    def __init__(self): #Se lanza por si solo
        self.nombre=input("Ingrese el nombre del empleado: ")
        self.sueldo=float(input("Ingrese el sueldo: "))

    def imprimir(self):
        print("Nombre:",self.nombre)
        print("Sueldo:",self.sueldo)

    def paga_impuestos(self):
        if self.sueldo>3000:
            print("Debe pagar impuestos")
        else:
            print("No paga impuestos")


empleado1=Empleado()
empleado1.imprimir()
empleado1.paga_impuestos()

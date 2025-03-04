class Persona:

    def inicializar(self,nombre,edad):
        self.nombre=nombre
        self.edad=edad

    def imprimir(self):
        print("Nombre:",self.nombre)
        print("Edad:",self.edad)

    def mostrar_estado(self):
        if self.edad>=18:
            print("Es mayor de edad")
        else:
            print("Es menor de edad")

alumno1=Persona()
alumno1.inicializar("Pepe",20)
alumno1.imprimir()
alumno1.mostrar_estado()

alumno2=Persona()
alumno2.inicializar("María",12)
alumno2.imprimir()
alumno2.mostrar_estado()

class Alumno:

    def inicializar(self,nombre,nota):
        self.nombre=nombre
        self.nota=nota

    def imprimir(self):
        print("Nombre:",self.nombre)
        print("Nota:",self.nota)

    def mostrar_estado(self):
        if self.nota>=4:
            print("Regular")
        else:
            print("Libre")

alumno1=Alumno()
alumno1.inicializar("Diego",2)
alumno1.imprimir()
alumno1.mostrar_estado()

alumno2=Alumno()
alumno2.inicializar("Ana",10)
alumno2.imprimir()
alumno2.mostrar_estado()

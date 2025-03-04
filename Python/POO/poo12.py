class Persona:

    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def imprimir(self):
        print(self.nombre)
        print(self.edad)

class Alumno(Persona):
    def __init__(self, nombre, edad, curso):
        super().__init__(nombre, edad)
        self.curso = curso

    def imprimir(self):
        super().imprimir()
        print(self.curso)


class Profesor(Persona):
    def __init__(self, nombre, edad, asignatura):
        super().__init__(nombre, edad)
        self.asignatura = asignatura
    
    def imprimir(self):
        super().imprimir()
        print(self.asignatura)

alumno1 = Alumno("Antonio", 24, "2 DAM")
alumno1.imprimir()

profesor1 = Profesor("Paco", 69, "Sistema Gestión Empresarial")
profesor1.imprimir()
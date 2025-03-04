class Persona:

    variable=20

    def __init__(self,nombre):
        self.nombre=nombre


persona1=Persona("Juan")
persona2=Persona("Ana")
persona3=Persona("Luis")

print(persona1.nombre)
print(persona2.nombre)
print(persona3.nombre)

print(persona1.variable)
Persona.variable=5
print(persona2.variable)

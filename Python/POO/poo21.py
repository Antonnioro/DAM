class Cliente:

    def __init__(self,nombre,cantidad):
        self.nombre=nombre
        self.cantidad=cantidad

    def __add__(self,objeto2):
        s=self.cantidad+objeto2.cantidad
        return s

cli1=Cliente('Ana',1200)
cli2=Cliente('Luis',1500)
print("El total depositado por los dos clientes es")
print(cli1+cli2)
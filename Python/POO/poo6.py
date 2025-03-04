class Cuadrado:
    def __init__(self, lado):
        self.lado = lado
    
    def mostrarPerimetro(self):
        perimetro = self.lado * 4
        print("El perímetro del cuadrado es:",perimetro)
    
    def mostrarSuperficie(self):
        superficie = self.lado*self.lado
        #También se puede poner self.lado ** 2 (Si se pone un tres, sería al cubo.)
        print("La superficie del cuadrado es:",superficie)

cuadrado1 = Cuadrado(9)
cuadrado1.mostrarPerimetro()
cuadrado1.mostrarSuperficie()
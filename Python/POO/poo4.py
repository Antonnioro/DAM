class Triangulo:

    def inicializar(self):
        self.lado1 = int(input("Mete el primer lado: "))
        self.lado2 = int(input("Mete el segundo lado: "))
        self.lado3 = int(input("Mete el tercer lado: "))

    def imprimir(self):
        print("Valores de los lados del triángulo")
        print("Lado 1", self.lado1)
        print("Lado 2", self.lado2)
        print("Lado 3", self.lado3)
    
    def es_equilatero(self):
        if self.lado1 == self.lado2 and self.lado2 == self.lado3:
            print("El triángulo es equilátero")
        else:
            print("El triángulo no es equilátero")

triangulo1 = Triangulo()
triangulo1.inicializar()
triangulo1.imprimir()
triangulo1.es_equilatero()
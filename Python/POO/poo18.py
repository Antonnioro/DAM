class Punto:

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return "(" + str(self.x) + ", " + str(self.y) + ")"
    #Los str son para convertirlos en cadena, son distintos.

miPunto = Punto(3, 6)
print(miPunto)
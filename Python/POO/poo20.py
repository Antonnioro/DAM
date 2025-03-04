class Jugador:
    def __init__(self, nombre, puntaje):
        self.nombre = nombre
        self.puntaje = puntaje

    def __str__(self):
        cadena = self.nombre + " - "

        if self.puntaje < 1000:
            cadena += "principiante"
        else:
            cadena += "experto"
        return cadena

jugador1 = Jugador("Pepe",600)
jugador2 = Jugador("Pepa",6000)
print(jugador1)
print(jugador2)
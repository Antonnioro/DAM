x = int(input("Ingresa la coordenada X: "))
y = int(input("Ingresa la coordenada Y: "))

if x > 0 and y > 0:
    print("Primer Cuadrante")
elif x < 0 and y > 0:
    print("Segundo Cuadrante")
elif x < 0 and y < 0:
    print("Tercer Cuadrante")
elif x > 0 and y < 0:
    print("Cuarto Cuadrante")
else:
    print("Algunas de las coordenadas es 0")
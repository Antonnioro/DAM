def calcularPerimetro(lado):
    perimetro=lado*4
    print("El perímetro es:",perimetro)

def calcularSuperficie(lado):
    superficie=lado*lado
    print("La superficie es:",superficie)

def calcularDatos():
    lado=int(input("Mete el valor del lado: "))

    opcion = input("Que quieres calcular? Perímetro(P) o Área(A)? ")

    if opcion == "P":
        calcularPerimetro(lado)
    if opcion == "A":
        calcularSuperficie(lado)

calcularDatos()
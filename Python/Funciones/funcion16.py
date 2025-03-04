def cargar_datos():
    nombre=[]
    edad=[]

    for i in range(5):
        valor1=input("Mete el nombre de la persona: ")
        nombre.append(valor1)
        valor2=int(input("Añade la edad: "))
        edad.append(valor2)

    return [nombre,edad]

def mayores_edad(nombre,edad):
    print("Nombres de personas mayores de edad: ")

    for i in range(len(nombre)):
        if edad[i] >= 18:
            print(nombre[i])

def promedio_edades(edad):
    suma=0

    for i in range(len(edad)):
        suma+=edad[i]
    media=suma/5

    print("Edad promedio de las personas:",media)

nombres,edades=cargar_datos()
mayores_edad(nombres,edades)
promedio_edades(edades)
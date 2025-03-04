def cargar_listas():
    personas = []
    edades = []
    for i in range(5):
        nombre = input("Dame el nombre: ")
        edad = int(input("Dame la edad: "))
        personas.append(nombre)
        edades.append(edad)
    return[personas, edades]

def mayoria_edad(personas, edades):
    for i in range(5):
        if edades[i] >= 18:
            print(f"La persona {personas[i]} tiene {edades[i]} años")

def edad_media(edades):
    suma = 0
    for i in range(5):
        suma = suma + edades[i]
        media = suma /5
    return media

mis_personas, mis_edades = cargar_listas()
mayoria_edad(mis_personas, mis_edades)
mi_edad_media = edad_media(mis_edades)
print(mi_edad_media)
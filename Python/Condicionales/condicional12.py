cantidadPreguntas = int(input("Introduce la cantidad de preguntas: "))
cantidadAcertadas = int(input("Introduce la cantidad de preguntas acertadas: "))

if cantidadAcertadas > cantidadPreguntas:
    print("ERROR. Hay más preguntas acertadas que preguntadas")
else:
    porcentaje = int((cantidadAcertadas/cantidadPreguntas)*100)

    if porcentaje >= 90:
        print("Nivel Máximo")
    elif porcentaje >= 75 and porcentaje < 90:
        print("Nivel Medio")
    elif porcentaje >= 50 and porcentaje < 75:
        print("Nivel Regular")
    else:
        print("Fuera de nivel")
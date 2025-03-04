def cargar():
    agenda={}
    continuar="s"
    while continuar=="s":
        fecha = input("Mete una fecha: ")
        continua="s"
        lista=[]
        while continua=="s":
            hora = input("Mete la hora de la actividad: ")
            actividad = input("Mete una descripción de la actividad: ")
            lista.append((hora,actividad))
            continua=input("Quiere meter otra actividad para esa fecha? [s/n]: ")
        agenda[fecha]=lista
        continuar = input("Quieres meter otra fecha?[s/n]: ")
    return agenda

def imprimir(agenda):
    for fecha in agenda:
        print("Para la fecha:",fecha)
        for hora,actividad in agenda[fecha]:
            print(hora,actividad)

def consulta_fecha(agenda):
    fecha = input("Mete la fecha que quieras comprobar:")
    if fecha in agenda:
        for hora, actividad in agenda[fecha]:
            print(hora, actividad)
    else:
        print("No hay actividades para esa fecha")


agenda = cargar()
imprimir(agenda)
consulta_fecha(agenda)
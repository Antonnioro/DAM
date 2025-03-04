def cargar():
    alumnos={}
    for i in range(3):
        dni = input("Mete el dni: ")
        listaMaterias=[]
        continua = "s"
        while continua == "s":
            materia = input("Mete el nombre de la materia: ")
            nota = int(input("Mete la nota: "))

            listaMaterias.append((materia,nota))
            continua=input("Quieres cargar otra materia para el alumno? [s/n]: ")
        alumnos[dni] = listaMaterias
    return alumnos

def listar(alumnos):
    for dni in alumnos:
        print("DNI del alumno", dni)
        print("Materias que cursa y las notas")

        for nota, materia in alumnos[dni]:
            print(materia, nota)

def consultaNotas(alumnos):
    dni = input("Mete el dni que quieras consultar:")
    if dni in alumnos:
        for nota, materia in alumnos[dni]:
            print(materia, nota)


alumnos = cargar()
listar(alumnos)
consultaNotas(alumnos)
def cargarCandidatos():
    candidatos=[]

    for x in range(3):
        nombre = input("Mete el nombre del candidato: ")
        cantidad = int(input("Mete la cantidad de provincias: "))

        provincias = []

        for i in range(cantidad):
            provincia = input("Nombre de la provincia: ")
            votos = int(input("Cantidad de votos: "))

            provincias.append((provincia,votos))
        candidatos.append((nombre,provincias))
    return candidatos

def totalVotos(candidatos):
    for x in range(len(candidatos)):
        suma = 0

        for i in range(len(candidatos[x][1])):
            suma += candidatos[x][1][i][1]
        print(candidatos[x][0], suma)

candidatos = cargarCandidatos()
totalVotos(candidatos)

lista = ["Mario", "Ana", "Lucía", "Alberto", "Paco"]

contador = 0

for i in range(len(lista)):
    if len(lista[i]) >= 5:
        contador+=1

print(contador)
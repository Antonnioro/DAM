aprobados = 0
suspensos = 0

for i in range(10):
    nota = int(input("Mete la nota: "))
    if nota >=7:
        aprobados+=1
    else:
        suspensos+=1

print(f"Cantidad de aprobados: {aprobados}")
print(f"Cantidad de suspensos: {suspensos}")
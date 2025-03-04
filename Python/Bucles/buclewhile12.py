x = 1
mayores = 0
menores = 0

while x<=10:
    nota = int(input("Mete las notas: "))

    if nota >= 7:
        mayores +=1
    else:
        menores+=1
    x+=1

print(f"Notas mayores o iguales que 7: {mayores}")
print(f"Notas menores que 7: {menores}")
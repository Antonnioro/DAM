num1 = int(input("Mete el primer numero: "))
num2 = int(input("Mete el segundo numero: "))
num3 = int(input("Mete el tercer numero: "))

if num1 > num2:
    if num1 > num3:
        print(f"El numero más grande es {num1}")
    else:
        print(f"El numero más grande es {num3}")
else:
    if num2 > num3:
        print(f"El numero más grande es {num2}")
    else:
        print(f"El numero más grande es {num3}")
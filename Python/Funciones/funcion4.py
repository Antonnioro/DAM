def valores():
    numero1 = int(input("Mete el primer valor: "))
    numero2 = int(input("Mete el segundo valor: "))
    numero3 = int(input("Mete el tercer valor: "))

    if numero1<numero2 and numero1<numero3:
        print(numero1)
    else:
        if numero2<numero3:
            print(numero2)
        else:
            print(numero3)

valores()
valores()
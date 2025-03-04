numero = int(input("Mete un numero de 3 dígitos: "))

if numero < 0:
    print("ERROR. El número es negativo")
else:
    if numero < 10:
        print("El número es de un solo digito")
    else:
        if numero < 100:
            print("El número es de dos digitos")
        else:
            if numero < 1000:
                print("El número es de tres digitos")
            else:
                print("ERROR. El número es de más de tres dígitos")
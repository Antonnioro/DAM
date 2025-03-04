numero = int(input("Mete un numero de 3 dígitos: "))

if numero > 999:
    print("ERROR. El número es de más de tres dígitos")
elif numero > 99:
    print("El número es de tres digitos")
elif numero > 9:
    print("El número es de dos digitos")
elif numero >= 0:
    print("El número es de un solo digito")
else:
    print("ERROR. El número es negativo")
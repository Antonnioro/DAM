num1 = int(input("Indica el primer número: "))
num2 = int(input("Indica el segundo número: "))
num3 = int(input("Indica el tercer número: "))

if num1 < 10 or num2 < 10 or num3 < 10:
    print("Alguno de los números es menor a diez")
else:
    print("Todos los numeros son mayores a diez")
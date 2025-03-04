num1=int(input("Ingrese la primera nota: "))
num2=int(input("Ingrese la segunda nota: "))
num3=int(input("Ingrese la tercera nota: "))

media = (num1+num2+num3)/3

if media >= 7:
    print("Aprobado")
else:
    print("Suspenso")
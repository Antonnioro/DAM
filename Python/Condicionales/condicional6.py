nota1=int(input("Ingrese la primera nota: "))
nota2=int(input("Ingrese la segunda nota: "))
nota3=int(input("Ingrese la tercera nota: "))

media = (nota1+nota2+nota3)/3

if media>=7:
    print("Aprobado")
else:
    if media>=4:
        print("Regular")
    else:
        print("Suspenso")
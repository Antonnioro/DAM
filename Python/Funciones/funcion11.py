def media(n1, n2, n3):
    laMedia=(n1+n2+n3)/3
    return laMedia

numero1 = int(input("Mete el primer numero: "))
numero2 = int(input("Mete el segundo numero: "))
numero3 = int(input("Mete el tercer numero: "))

print("El valor medio de los numeros es", media(numero1,numero2,numero3))
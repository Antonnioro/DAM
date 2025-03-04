def sumar():
    valor1=int(input("Ingrese el primer valor: "))
    valor2=int(input("Ingrese el segundo valor: "))

    suma=valor1+valor2

    print("La suma de los dos valores es: ",suma)

def separador():
    print("--- --- --- --- --- --- --- --- --- ---")

for i in range(5):
    sumar()
    separador()
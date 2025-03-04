def mostrar_mensaje(mensaje):
    print("--- --- --- --- --- --- ---")
    print(mensaje)
    print("--- --- --- --- --- --- ---")

def carga_suma():
    valor1 = int(input("Mete el primer valor: "))
    valor2 = int(input("Mete el segundo valor: "))
    suma = valor1 + valor2
    print("La suma de los dos valores es: ",suma)

mostrar_mensaje("El programa calcula la suma de dos valores ingresador por teclado")
carga_suma()
mostrar_mensaje("Gracias por usar este programa.")
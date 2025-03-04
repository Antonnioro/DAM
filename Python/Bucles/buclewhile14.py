x1 = 1
x2 = 1
sumaLista1 = 0
sumaLista2 = 0

print("Primera lista: ")
while x1<=15:
    valor = int(input("Mete el valor: "))
    sumaLista1+=valor
    x1+=1

print("Segunda lista: ")
while x2<=15:
    valor=int(input("Mete el valor: "))
    sumaLista2+=valor
    x2+=1

if sumaLista1 > sumaLista2:
    print("La lista 1 es mayor")
elif sumaLista2 > sumaLista1:
    print("La lista 2 es mayor")
else:
    print("Las dos listas son iguales")

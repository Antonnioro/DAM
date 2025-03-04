def carga_lista():
    li=[]
    for x in range(5):
        valor=int(input("Ingrese valor: "))
        li.append(valor)
    return li



def retornar_suma(li):
    suma = 0
    for i in range(len(li)):
        suma += li[i]
    return suma

lista = carga_lista()
sumaTotal = retornar_suma(lista)
print("Suma total de los valores:",sumaTotal)
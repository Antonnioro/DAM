class Lista:

    def __init__(self, lista):
        self.lista=lista

    def imprimir(self):
        print(self.lista)

    def __add__(self,entero):
        nueva=[]
        for x in range(len(self.lista)):
            nueva.append(self.lista[x]+entero)
        return nueva

    def __sub__(self,entero):
        nueva=[]
        for x in range(len(self.lista)):
            nueva.append(self.lista[x]-entero)
        return nueva

    def __mul__(self,entero):
        nueva=[]
        for x in range(len(self.lista)):
            nueva.append(self.lista[x]*entero)
        return nueva

    def __floordiv__(self,entero):
        nueva=[]
        for x in range(len(self.lista)):
            nueva.append(self.lista[x]//entero)
        return nueva

lista1=Lista([3,4,5])
lista1.imprimir()
print(lista1+10)
print(lista1-10)
print(lista1*10)
print(lista1//10)
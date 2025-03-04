class Familia:

    def __init__(self,padre,madre,hijos=[]):
        self.padre=padre
        self.madre=madre
        self.hijos=hijos

    def __str__(self):
        cadena=self.padre+","+self.madre
        for hi in self.hijos:
            cadena=cadena+","+hi
        return cadena


familia1=Familia("Pablo","Ana",["Pepe","Julio"])
familia2=Familia("Jorge","Carla")
familia3=Familia("Luis","Maria",["Marcos"])

print(familia1)
print(familia2)
print(familia3)
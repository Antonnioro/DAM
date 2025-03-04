class Agenda:

    def __init__(self):
        self.contactos = {}
    
    def menu(self):
        opcion = 0
        while opcion!=5:
            print("1 - Carga de un contacto en la agenda")
            print("2 - Listado completo de la agenda")
            print("3 - Consulta ingresando el nombre de la persona")
            print("4 - Modificación de su teléfono y mail.")
            print("5 - Finalizar programa")

            opcion=int(input("Ingrese su opcion: "))
            if opcion==1:
                self.cargar()
            elif opcion==2:
                self.listado()
            elif opcion==3:
                self.consulta()
            elif opcion==4:
                self.modificacion()
    
    def cargar(self):
        nombre = input("Mete el nombre de la persona: ")
        telefono = input("Mete el numero de telefono: ")
        mail = input("Mete el correo: ")
        self.contactos[nombre] = (telefono, mail)
    
    def listado(self):
        print("Listado completo de la agenda")
        for nombre in self.contactos:
            print(nombre, self.contactos[nombre][0], self.contactos[nombre][1])

    def consulta(self):
        nombre = input("Mete el nombre de la persona: ")
        if nombre in self.contactos:
            print(nombre," su telefono es",self.contactos[nombre][0],"y su mail es",self.contactos[nombre][1])
        else:
            print("No existe un contacto con ese nombre")
    
    def modificacion(self):
        nombre=input("Ingrese el nombre de la persona a modificar el telefono y mail:")
        if nombre in self.contactos:
            telefono=input("Ingrese el nuevo telefono:")
            mail=input("Ingrese el nuevo mail:")
            self.contactos[nombre]=(telefono,mail)
        else:
            print("No existe un contaxto con ese nombre")

agenda = Agenda()
agenda.menu()

import tkinter as tk

class Aplicacion:
    def __init__(self):
        self.ventana1 = tk.Tk()
        
        self.label1 = tk.Label(self.ventana1, text="Mete un nombre")
        self.label1.grid(column=0, row=0)
        
        self.nombre = tk.StringVar()
        self.entry1 = tk.Entry(self.ventana1, width=40, textvariable=self.nombre)
        self.entry1.grid(column=0, row=1)
        
        self.label2 = tk.Label(self.ventana1, text="Selecciona un país")
        self.label2.grid(column=0, row=2)
        
        self.listbox1 = tk.Listbox(self.ventana1)
        self.listbox1.grid(column=0, row=3)
        
        self.listbox1.insert(0,"España")
        self.listbox1.insert(1,"Portugal")
        self.listbox1.insert(2,"Francia")
        self.listbox1.insert(3,"Andorra")
        self.listbox1.insert(4,"Inglaterra")
        self.listbox1.insert(5,"Marruecos")
        
        self.boton1 = tk.Button(self.ventana1, text="Recuperar", command = self.mostrarDatos)
        self.boton1.grid(column=0, row=4)
        
        self.ventana1.mainloop()
        
    def mostrarDatos(self):
        if len(self.listbox1.curselection())!=0:
            self.ventana1.title("Nombre:"+self.nombre.get()+" Pais:"+self.listbox1.get(self.listbox1.curselection()[0]))

aplicacion1=Aplicacion()
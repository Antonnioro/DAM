import tkinter as tk
from tkinter import ttk

class Aplicacion:
    def __init__(self):
        self.ventana1 = tk.Tk()
        
        self.label1 = ttk.Label(text="Mete nombre")
        self.label1.grid(column = 0, row = 0)
        
        self.nombre = tk.StringVar()
        
        self.entry1 = ttk.Entry(self.ventana1, width = 40, textvariable = self.nombre)
        self.entry1.grid(column = 0, row = 1)
        
        self.label2 = ttk.Label(text = "Mete pais")
        self.label2.grid(column = 0, row = 2)
        
        self.pais = tk.StringVar()
        
        paises=("España","Portugal","Francia","Inglaterra","Andorra","Marruecos")
        
        self.combobox1=ttk.Combobox(self.ventana1,
                                    width=10,
                                    textvariable=self.pais,
                                    values=paises,
                                    state='readonly')
        self.combobox1.grid(column=0, row=3)
        
        self.boton1=tk.Button(self.ventana1, text="Recuperar", command=self.mostrardatos)
        self.boton1.grid(column=0, row=4)
        
        self.ventana1.mainloop()

    def mostrardatos(self):
        self.ventana1.title("Nombre: "+self.nombre.get()+" Pais: "+self.combobox1.get())

aplicacion1=Aplicacion()

import tkinter as tk
from tkinter import ttk

class Aplicacion:
    def __init__(self):
        self.ventana1=tk.Tk()
        self.seleccion=tk.IntVar()
        self.seleccion.set(2)
        
        self.radio1=ttk.Radiobutton(self.ventana1,text="Varon", variable=self.seleccion, value=1)
        self.radio1.grid(column=0, row=0)
        
        self.radio2=ttk.Radiobutton(self.ventana1,text="Mujer", variable=self.seleccion, value=2)
        self.radio2.grid(column=0, row=1)
        
        self.boton1=ttk.Button(self.ventana1, text="Mostrar seleccionado", command=self.mostrarseleccionado)
        self.boton1.grid(column=0, row=2)
        
        self.label1=ttk.Label(text="Opcion seleccionada")
        self.label1.grid(column=0, row=3)
        
        self.ventana1.mainloop()

    def mostrarseleccionado(self):
        if self.seleccion.get()==1:
            self.label1.configure(text="Opcion seleccionada = Varon")
        if self.seleccion.get()==2:
            self.label1.configure(text="Opcion seleccionada = Mujer")

aplicacion1=Aplicacion()

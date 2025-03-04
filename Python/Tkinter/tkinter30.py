import tkinter as tk
from tkinter import ttk
import sys

class Aplicacion:
    
    def __init__(self):
        self.ventana1 = tk.Tk()
        
        self.ancho=tk.StringVar()
        self.alto=tk.StringVar()
        
        menuBar1 = tk.Menu(self.ventana1)
        self.ventana1.config(menu = menuBar1)
        
        opciones1 = tk.Menu(menuBar1)
        opciones1.add_command(label = "Cambiar dimensión ventana", command = self.fijarTamano)
        opciones1.add_command(label="Finalizar", command=self.finalizar)
        menuBar1.add_cascade(label="Opciones", menu=opciones1)
        
        self.label1=ttk.Label(text="Mete el valor de la coordenada X:")
        self.label1.grid(column=0, row=0)
        
        self.entry1=ttk.Entry(self.ventana1, width=10, textvariable=self.ancho)
        self.entry1.grid(column=0, row=1)
        
        self.label2=ttk.Label(text="Mete el valor de la coordenada Y:")
        self.label2.grid(column=0, row=2)
        
        self.entry2=ttk.Entry(self.ventana1, width=10, textvariable=self.alto)
        self.entry2.grid(column=0, row=3)

        self.ventana1.mainloop()
    
    def fijarTamano(self):
        self.ventana1.geometry(self.ancho.get()+"x"+self.alto.get())
    
    def finalizar(self):
        sys.exit()

aplicacion1=Aplicacion()
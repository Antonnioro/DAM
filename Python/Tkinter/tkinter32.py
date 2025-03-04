import tkinter as tk
from tkinter import ttk

class Aplicacion:
    def __init__(self):
        self.ventana1=tk.Tk()
        self.ventana1.title("Aplicacion Notebook")
        
        self.cuaderno1 = ttk.Notebook(self.ventana1)

        self.pagina1 = ttk.Frame(self.cuaderno1)
        self.cuaderno1.add(self.pagina1, text="Frame 1")
        self.label1=ttk.Label(self.pagina1, text="Frame 1 presente!")
        self.label1.grid(column=0, row=0)

        self.pagina2 = ttk.Frame(self.cuaderno1)
        self.cuaderno1.add(self.pagina2, text="Frame 2")
        self.label2=ttk.Label(self.pagina2, text="Pollo")
        self.label2.grid(column=0, row=0)

        self.pagina3 = ttk.Frame(self.cuaderno1)
        self.cuaderno1.add(self.pagina3, text="Frame 3")
        self.label4=ttk.Label(self.pagina3, text="Este texto pertenece al Frame 3")
        self.label4.grid(column=0, row=0)

        self.cuaderno1.grid(column=0, row=0)

        self.ventana1.mainloop()

aplicacion1=Aplicacion()
import tkinter as tk

class Aplicacion:
    def __init__(self):
        self.ventana1 = tk.Tk()
        
        self.seleccion1 = tk.IntVar()
        self.check1 = tk.Checkbutton(self.ventana1, text = "Chrome", variable = self.seleccion1, command = self.cambiarTitulo)
        self.check1.grid(column=0, row=0)
        
        self.seleccion2 = tk.IntVar()
        self.check2 = tk.Checkbutton(self.ventana1, text = "Edge", variable = self.seleccion2, command = self.cambiarTitulo)
        self.check2.grid(column=1, row=0)
        
        self.seleccion3 = tk.IntVar()
        self.check3 = tk.Checkbutton(self.ventana1, text = "Firefox", variable = self.seleccion3, command = self.cambiarTitulo)
        self.check3.grid(column=2, row=0)
        
        self.seleccion4 = tk.IntVar()
        self.check4 = tk.Checkbutton(self.ventana1, text = "Opera", variable = self.seleccion4, command = self.cambiarTitulo)
        self.check4.grid(column=3, row=0)
        
        self.ventana1.mainloop()
    
    def cambiarTitulo(self):
        cadena = ""
        
        if self.seleccion1.get() == 1:
            cadena += "Chrome - "
            
        if self.seleccion2.get() == 1:
            cadena += "Edge - "
            
        if self.seleccion3.get() == 1:
            cadena += "Firefox - "
            
        if self.seleccion4.get() == 1:
            cadena += "Opera"
        
        self.ventana1.title(cadena)

aplicacion1 = Aplicacion()
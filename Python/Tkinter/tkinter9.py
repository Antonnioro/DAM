import tkinter as tk

class Aplicacion:
    def __init__(self):
        self.ventana1 = tk.Tk()

        self.dato1=tk.StringVar()
        self.dato2=tk.StringVar()

        self.label1 = tk.Label(self.ventana1, text = "Mete el nombre de usuario:")
        self.label1.grid(column=0, row=0)

        self.entry1=tk.Entry(self.ventana1, width=20, textvariable=self.dato1)
        self.entry1.grid(column=1, row=0)

        self.label2 = tk.Label(self.ventana1, text = "Mete la contraseña: ")
        self.label2.grid(column=0, row=1)

        self.entry2=tk.Entry(self.ventana1, width=30, textvariable=self.dato2, show="*")
        self.entry2.grid(column=1, row=1)

        self.boton1=tk.Button(self.ventana1, text="Ingresar", command=self.ingresar)
        self.boton1.grid(column=1, row=2)

        self.ventana1.mainloop()
    
    def ingresar(self):
        if self.dato1.get()=="juan" and self.dato2.get()=="abc123":
            self.ventana1.title("Correcto")
        else:
            self.ventana1.title("Incorrecto")

aplicacion1=Aplicacion()
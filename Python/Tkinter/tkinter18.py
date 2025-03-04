import tkinter as tk

class Aplicacion:
    def __init__(self):
        self.ventana1=tk.Tk()
        
        self.scroll1 = tk.Scrollbar(self.ventana1, orient=tk.VERTICAL)
        
        #Scrollbar permite añadir una barra de desplazamiento
        
        self.listbox1=tk.Listbox(self.ventana1, selectmode=tk.MULTIPLE, yscrollcommand=self.scroll1.set)
        self.listbox1.grid(column=0,row=0)
        
        #yscrollcommand es para indicar que está en el eje Y
        
        self.scroll1.configure(command=self.listbox1.yview)
        self.scroll1.grid(column=1, row=0, sticky='NS')
        
        self.listbox1.insert(0,"Patata")
        self.listbox1.insert(1,"Manzana")
        self.listbox1.insert(2,"Pera")
        self.listbox1.insert(3,"Sandia")
        self.listbox1.insert(4,"Naranja")
        self.listbox1.insert(5,"Melon")
        self.listbox1.insert(6,"Limon")
        self.listbox1.insert(7,"Kiwi")
        self.listbox1.insert(8,"Plátano")
        self.listbox1.insert(9,"Uva")
        self.listbox1.insert(10,"Papaya")
        self.listbox1.insert(11,"Mandarina")
        self.listbox1.insert(12,"Fresa")
        
        self.boton1=tk.Button(self.ventana1, text="Recuperar", command=self.recuperar)
        self.boton1.grid(column=0, row=1)
        
        self.label1=tk.Label(self.ventana1,text="Seleccionado:")
        self.label1.grid(column=0, row=2)
        
        self.ventana1.mainloop()

    def recuperar(self):
        if len(self.listbox1.curselection())!=0:
            todas=''
            for posicion in self.listbox1.curselection():
                todas+=self.listbox1.get(posicion)+"\n"
            self.label1.configure(text=todas)

aplicacion1=Aplicacion()

def titulo_subrayado(titulo, caracter = "*"):
    print(titulo)
    print(caracter*len(titulo))

titulo_subrayado("Sistema de Administracion")
titulo_subrayado("Ventas","-")

# Los parámentros por defecto siempre van al final.
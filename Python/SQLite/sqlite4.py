import sqlite3

conexion=sqlite3.connect("E:/Sistema Gestion Empresarial/Segundo Trimestre/Python/SQLite/bd1.db")
codigo=int(input("Ingrese el código de un artículo:"))
cursor=conexion.execute("select descripcion,precio from articulos where codigo=?", (codigo, ))
fila=cursor.fetchone()
if fila!=None:
    print(fila)
else:
    print("No existe un artículo con dicho código.")
conexion.close()

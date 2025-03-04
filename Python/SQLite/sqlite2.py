import sqlite3

conexion=sqlite3.connect("E:/Sistema Gestion Empresarial/Segundo Trimestre/Python/SQLite/bd1.db")
conexion.execute("insert into articulos(descripcion,precio) values (?,?)", ("naranjas", 23.50))
conexion.execute("insert into articulos(descripcion,precio) values (?,?)", ("peras", 34))
conexion.execute("insert into articulos(descripcion,precio) values (?,?)", ("bananas", 25))
conexion.commit()
conexion.close()

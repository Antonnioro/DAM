package tablaEmpleados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio11CrearTablaEmpleados {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		Statement stmt = null;
		String sql = "CREATE TABLE empleados (id INT PRIMARY KEY," + "nombre VARCHAR(30) NOT NULL,"
				+ "apellido VARCHAR(30) NOT NULL," + "email VARCHAR(50) NOT NULL," + "telefono VARCHAR(13) NOT NULL,"
				+ "direccion VARCHAR(50) NOT NULL," + "salario DECIMAL(6, 2)," + "fecha_contratacion DATE)";

		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Creada la tabla empleados");
			conn.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

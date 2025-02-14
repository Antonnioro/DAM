package tablaEmpleados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio12InsertarDatosEmpleados {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		Statement stmt = null;
		String sql = "INSERT INTO empleados (id, nombre, apellido, email, telefono, direccion, salario, fecha_contratacion )"
				+ "VALUES (3, 'Pepe', 'García', 'PeGar@gmail.com', '+34 777444111', 'Calle Default Nº Not Null', 1000.00, '1999-12-31')";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);

			System.out.println("Datos insertados en la tabla empleados");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

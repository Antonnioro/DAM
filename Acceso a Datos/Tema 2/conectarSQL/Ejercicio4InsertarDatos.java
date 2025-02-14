package conectarSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio4InsertarDatos {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		Statement stmt = null;
		String sql = "INSERT INTO clientes (id,nif,nombre,edad)" + "VALUES (3, '33333', 'Rodrigo', '69')";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa1", "root", "");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql); // Esto es para que actualice

			System.out.println("Datos insertados en la tabla clientes");
			conn.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

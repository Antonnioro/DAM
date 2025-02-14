package conectarSQL;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Ejercicio1ConectarBaseDatos {

	public static void main(String[] args) throws SQLException {

		Connection connect = null;

		try {
			connect = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "root", "");
			if (connect != null) {
				System.out.println("Conexión a base de datos ok");
				connect.close(); //Es necesario cerrar la conexión.
			}
		} catch (SQLException e) {
			System.out.println("Error en la conexión " + e.getMessage());
		}

	}

}

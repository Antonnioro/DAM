package preparedStatementTienda;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConectarBaseDatosTienda {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
			if (conn != null) {
				System.out.println("Conexión a base de datos de tienda ok");
				conn.close(); // Es necesario cerrar la conexión.
			}
		} catch (SQLException e) {
			System.out.println("Error en la conexión " + e.getMessage());
		}

	}

}

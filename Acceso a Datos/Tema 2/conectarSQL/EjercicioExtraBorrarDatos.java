package conectarSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EjercicioExtraBorrarDatos {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		Statement stmt = null;
		String sql = "DELETE FROM clientes WHERE id = 1";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa1", "root", "");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);

			System.out.println("Datos borrados de la tabla clientes");
			conn.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

package consultaProcedimientoAlmacenado;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearProcedimientoAlmacenado {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;

		String query = "CREATE PROCEDURE selectAllClients() " + "BEGIN " + "SELECT * FROM clientes;" + "END;";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");

			Statement stmt = conn.createStatement();

			stmt.executeUpdate(query);

			System.out.println("Procedimiento creado");

			conn.close();
			stmt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}

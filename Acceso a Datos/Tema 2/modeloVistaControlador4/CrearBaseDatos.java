package modeloVistaControlador4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearBaseDatos {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;

		String sql = "CREATE DATABASE instituto";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("La base de datos instituto ok");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

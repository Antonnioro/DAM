package preparedStatementEmpresa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "CREATE TABLE proveedores (id INT PRIMARY KEY, nif VARCHAR(10) NOT NULL, nombre VARCHAR(60) NOT NULL, edad VARCHAR(2)";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa3", "root", "");
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
			System.out.println("Creada la tabla proveedores");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

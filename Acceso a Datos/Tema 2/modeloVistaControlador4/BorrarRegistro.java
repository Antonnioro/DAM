package modeloVistaControlador4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BorrarRegistro {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		String sql = "DELETE FROM cursos WHERE id = 2";
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/instituto", "root", "");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);

			System.out.println("Datos borrados de la tabla cursos");
			conn.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

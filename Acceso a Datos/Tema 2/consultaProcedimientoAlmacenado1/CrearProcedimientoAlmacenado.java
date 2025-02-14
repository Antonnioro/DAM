package consultaProcedimientoAlmacenado1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearProcedimientoAlmacenado {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;

		String query = "CREATE PROCEDURE selectAllCursos() " + "BEGIN " + "SELECT * FROM cursos;" + "END;";
		String query1 = "CREATE PROCEDURE selectAllAlumnos() " + "BEGIN " + "SELECT * FROM alumnos;" + "END;";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/instituto", "root", "");

			Statement stmt = conn.createStatement();

			stmt.executeUpdate(query);
			stmt.executeUpdate(query1);

			System.out.println("Procedimiento creado");

			conn.close();
			stmt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}

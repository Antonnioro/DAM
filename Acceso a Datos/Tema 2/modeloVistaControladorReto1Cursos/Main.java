package modeloVistaControladorReto1Cursos;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {

		String dbURL = "jdbc:mysql://localhost/instituto";
		String dbUser = "root";
		String dbPassword = "";

		try {
			CursoController controller = new CursoController(dbURL, dbUser, dbPassword);
			controller.mostrarCursos();
			controller.cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

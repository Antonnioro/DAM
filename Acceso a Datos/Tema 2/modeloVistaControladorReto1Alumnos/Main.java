package modeloVistaControladorReto1Alumnos;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {

		String dbURL = "jdbc:mysql://localhost/instituto";
		String dbUser = "root";
		String dbPassword = "";

		try {
			AlumnoController controller = new AlumnoController(dbURL, dbUser, dbPassword);
			controller.mostrarAlumnos();
			controller.cerrarConexion();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

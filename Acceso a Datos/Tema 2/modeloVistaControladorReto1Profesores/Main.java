package modeloVistaControladorReto1Profesores;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {

		String dbURL = "jdbc:mysql://localhost/instituto";
		String dbUser = "root";
		String dbPassword = "";

		try {
			ProfesorController controller = new ProfesorController(dbURL, dbUser, dbPassword);
			controller.mostrarProfesor();
			controller.cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

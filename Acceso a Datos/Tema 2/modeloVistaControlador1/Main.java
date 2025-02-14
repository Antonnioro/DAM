package modeloVistaControlador1;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {

		String dbURL = "jdbc:mysql://localhost/empresa1";
		String dbUser = "root";
		String dbPassword = "";

		try {
			ClienteController controller = new ClienteController(dbURL, dbUser, dbPassword);
			controller.mostrarClientes();
			controller.cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

package modeloVistaControlador3;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {

		String dbURL = "jdbc:mysql://localhost/tienda";
		String dbUser = "root";
		String dbPassword = "";

		try {
			EmpleadoController controller = new EmpleadoController(dbURL, dbUser, dbPassword);
			controller.mostrarEmpleados();
			controller.cerrarConexion();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

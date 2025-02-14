package modeloVistaControlador3;

import java.sql.SQLException;
import java.util.List;

public class EmpleadoController {

	private EmpleadoModel model;
	private EmpleadoView view;

	public EmpleadoController(String dbURL, String dbUser, String dbPassword) throws SQLException {
		model = new EmpleadoModel(dbURL, dbUser, dbPassword);
		view = new EmpleadoView();
	}

	public void mostrarEmpleados() throws SQLException {
		List<Empleado> empleados = model.getAllEmpleados();
		view.mostrarEmpleados(empleados);
	}

	public void cerrarConexion() throws SQLException {
		model.close();
	}

}

package modeloVistaControladorReto1Profesores;

import java.sql.SQLException;
import java.util.List;

public class ProfesorController {

	private ProfesorModel model;
	private ProfesorView view;

	public ProfesorController(String dbURL, String dbUser, String dbPassword) throws SQLException {

		model = new ProfesorModel(dbURL, dbUser, dbPassword);
		view = new ProfesorView();
	}
	
	public void mostrarProfesor() throws SQLException {
		List<Profesor> profesores = model. getAllProfesor();
		view.mostrarProfesor(profesores);
	}
	
	public void cerrarConexion() throws SQLException {
		model.close();
	}
}

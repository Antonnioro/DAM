package modeloVistaControladorReto1Cursos;

import java.sql.SQLException;
import java.util.List;

public class CursoController {

	private CursoModel model;
	private CursoView view;

	public CursoController(String dbURL, String dbUser, String dbPassword) throws SQLException {
		model = new CursoModel(dbURL, dbUser, dbPassword);
		view = new CursoView();
	}

	public void mostrarCursos() throws SQLException {
		List<Curso> cursos = model.getAllCursos();
		view.mostrarCursos(cursos);
	}

	public void cerrarConexion() throws SQLException {
		model.close();
	}

}

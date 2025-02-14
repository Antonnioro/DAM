package modeloVistaControladorReto1Cursos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoModel {

	private Connection conn;

	public CursoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {

		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	public List<Curso> getAllCursos() throws SQLException {
		List<Curso> cursos = new ArrayList<>();

		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM cursos");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String codigo = rs.getString("codigo");
			String nombre = rs.getString("nombre");
			int capacidad = rs.getInt("capacidad");

			cursos.add(new Curso(id, codigo, nombre, capacidad));
		}

		stmt.close();
		rs.close();
		return cursos;

	}

	public void close() throws SQLException {
		conn.close();
	}

}

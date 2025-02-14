package modeloVistaControladorReto1Alumnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlumnoModel {

	private Connection conn;

	public AlumnoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {

		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	public List<Alumno> getAllAlumnos() throws SQLException {
		List<Alumno> alumnos = new ArrayList<>();

		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM alumnos");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String nif = rs.getString("nif");
			String nombre = rs.getString("nombre");
			String apellido = rs.getString("apellido");
			int edad = rs.getInt("edad");

			alumnos.add(new Alumno(id, nif, nombre, apellido, edad));
		}
		stmt.close();
		rs.close();
		return alumnos;
	}

	public void close() throws SQLException {
		conn.close();
	}

}

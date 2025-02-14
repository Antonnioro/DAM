package modeloVistaControladorReto1Profesores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfesorModel {

	private Connection conn;

	public ProfesorModel(String dbURL, String dbUser, String dbPassword) throws SQLException {

		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	public List<Profesor> getAllProfesor() throws SQLException {
		List<Profesor> profesores = new ArrayList<>();

		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM profesores");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String nif = rs.getString("nif");
			String nombre = rs.getString("nombre");
			String apellido = rs.getString("apellido");
			int salario = rs.getInt("salario");

			profesores.add(new Profesor(id, nif, nombre, apellido, salario));
		}
		stmt.close();
		rs.close();
		return profesores;
	}

	public void close() throws SQLException {
		conn.close();
	}

}

package modeloVistaControlador1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteModel {

	private Connection conn;

	public ClienteModel(String dbURL, String dbUser, String dbPassword) throws SQLException {

		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	public List<Cliente> getAllClientes() throws SQLException {
		List<Cliente> clientes = new ArrayList<>();

		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM clientes");
		//prepareStatement es mas seguro

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String nif = rs.getString("nif");
			String nombre = rs.getString("nombre");
			String edad = rs.getString("edad");
			clientes.add(new Cliente(id, nif, nombre, edad));
		}

		stmt.close();
		rs.close();
		return clientes;
	}

	public void close() throws SQLException {
		conn.close();
	}

}

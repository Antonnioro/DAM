package modeloVistaControlador2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoModel {

	private Connection conn;

	public ProductoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {

		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	public List<Producto> getAllProductos() throws SQLException {
		List<Producto> productos = new ArrayList<>();

		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM productos");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String codigo = rs.getString("codigo");
			String nombre = rs.getString("nombre");
			double precio = rs.getDouble("precio");
			productos.add(new Producto(id, codigo, nombre, precio));
		}

		stmt.close();
		rs.close();
		return productos;
	}

	public void close() throws SQLException {
		conn.close();
	}

}

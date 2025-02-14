package baseDatosTienda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio10MostrarDatosProductos {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		String sql = "SELECT * FROM productos";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
			stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("id");
				String codigo = rs.getString("codigo");
				String nombre = rs.getString("nombre");
				String precio = rs.getString("precio");
				System.out.println("id: " + id + ", codigo: " + codigo + ", nombre: " + nombre + ", precio: " + precio);

			}

			conn.close();
			stmt.close();
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

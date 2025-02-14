package preparedStatementTienda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MostrarDatosProductos {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		String sql = "SELECT * FROM productos WHERE id = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setString(1, "valor3");

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String codigo = rs.getString("codigo");
				String nombre = rs.getString("nombre");
				String precio = rs.getString("precio");
				System.out.println("id: " + id + ", codigo: " + codigo + ", nombre: " + nombre + ", precio: " + precio);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

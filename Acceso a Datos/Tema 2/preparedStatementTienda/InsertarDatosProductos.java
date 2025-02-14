package preparedStatementTienda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatosProductos {

	public static void main(String[] args){

		Connection conn = null;
		PreparedStatement stmt = null;
		
		String sql = "INSERT INTO productos (id, codigo, nombre, precio) VALUES (?, ?, ?, ?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, "A001");
			pstmt.setString(2, "A002");
			pstmt.setString(3, "A003");
			int filasAfectadas = pstmt.executeUpdate();
			System.out.println("Filas insertadas: " + filasAfectadas);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
package preparedStatementTienda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BorrarDatosTienda {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;

		String sql = "DELETE FROM productos WHERE id = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, "valor_a_eliminar");
			int filasAfectadas = pstmt.executeUpdate();
			System.out.println("Filas eliminadas: " + filasAfectadas);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

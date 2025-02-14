package preparedStatementEmpresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EliminarDatos {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement stmt = null;

		String sql = "DELETE FROM tabla WHERE columna = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, "valor_a_eliminar");
			int filasAfectadas = pstmt.executeUpdate();
			System.out.println("Filas eliminadas: " + filasAfectadas);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

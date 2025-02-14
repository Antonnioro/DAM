package preparedStatementEmpresa;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class InsertarDatos {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement stmt = null;

		String sql = "INSERT INTO tabla (columna1, columna2) VALUES (?, ?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, "valor1");
			pstmt.setString(2, "valor2");
			int filasAfectadas = pstmt.executeUpdate();
			System.out.println("Filas insertadas: " + filasAfectadas);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

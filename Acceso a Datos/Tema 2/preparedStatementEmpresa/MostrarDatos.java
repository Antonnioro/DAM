package preparedStatementEmpresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MostrarDatos {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement stmt = null;

		String sql = "SELECT columna1, columna2 FROM tabla WHERE columna3 = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, "valor3");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String columna1 = rs.getString("columna1");
				String columna2 = rs.getString("columna2");
				System.out.println("Columna 1: " + columna1 + ", Columna 2: " + columna2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

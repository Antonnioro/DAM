package preparedStatementTienda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class CrearTablaProductos {

	public static void main(String[] args){

		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "CREATE TABLE productos (id INT PRIMARY KEY," + "codigo VARCHAR(15) NOT NULL,"
				+ "nombre VARCHAR(60) NOT NULL," + "precio DECIMAL(5, 2))";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate(sql);
			System.out.println("Creada la tabla productos");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

package consultaProcedimientoAlmacenado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class InvocarProcedimientoAlmacenado {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		CallableStatement llamadaProcedure = null;
		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");
			System.out.println("Conexión ok");

			String sql = "{call ObtenerClientes ()}";
			llamadaProcedure = conn.prepareCall(sql);

			boolean resultado = llamadaProcedure.execute();
			if (resultado) {
				ResultSet lista = llamadaProcedure.getResultSet();
				System.out.println("id nombre ciudad");
				while (lista.next()) {

					int id = lista.getInt("id");
					String nombre = lista.getString("nombre");
					String ciudad = lista.getString("ciudad");

					System.out.println(id + " " + nombre + " " + ciudad);
				}
			}
		} catch (SQLException ex) {
			System.out.println("Se ha producido un error en la ejecucion de la SQL: " + ex.getMessage());
		}

	}

}

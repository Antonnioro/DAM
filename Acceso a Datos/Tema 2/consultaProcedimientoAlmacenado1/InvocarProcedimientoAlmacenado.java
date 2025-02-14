package consultaProcedimientoAlmacenado1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class InvocarProcedimientoAlmacenado {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		CallableStatement llamadaProcedureCursos = null;
		CallableStatement llamadaProcedureAlumnos = null;
		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost/instituto", "root", "");
			System.out.println("Conexión ok");

			String sql = "{call selectAllCursos ()}";
			llamadaProcedureCursos = conn.prepareCall(sql);

			String sql1 = "{call selectAllAlumnos ()}";
			llamadaProcedureAlumnos = conn.prepareCall(sql);

			boolean resultado = llamadaProcedureCursos.execute();

			if (resultado) {
				ResultSet lista = llamadaProcedureCursos.getResultSet();
				System.out.println("id nombre ciudad");
				while (lista.next()) {

					int id = lista.getInt("id");
					String codigo = lista.getString("codigo");
					String nombre = lista.getString("nombre");
					int capacidad = lista.getInt("capacidad");

					System.out.println(id + " " + codigo + " " + nombre + " " + capacidad);
				}
			}

			if (resultado) {
				ResultSet lista = llamadaProcedureAlumnos.getResultSet();
				System.out.println("id nombre ciudad");
				while (lista.next()) {

					int id = lista.getInt("id");
					String nif = lista.getString("nif");
					String nombre = lista.getString("nombre");
					String apellido = lista.getString("apellido");
					int edad = lista.getInt("edad");

					System.out.println(id + " " + nif + " " + nombre + " " + apellido + " " + edad);
				}
			}

		} catch (SQLException ex) {
			System.out.println("Se ha producido un error en la ejecucion de la SQL: " + ex.getMessage());
		}

	}

}

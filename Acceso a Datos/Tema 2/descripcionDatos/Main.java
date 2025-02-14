package descripcionDatos;

//Ejercicio 17

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	static String login = "root";
	static String password = "";
	static String url = "jdbc:mysql://localhost/empresa";

	public static void main(String[] args) throws Exception {

		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, login, password);
			if (conn != null) {
				System.out.println("Conexión a BBDD " + url + " ... Ok");
				DatabaseMetaData meta = conn.getMetaData();
				System.out.println("Versión del driver JDBC: " + meta.getDriverVersion());
				System.out.println("Nombre de la BBDD: " + meta.getDatabaseProductName());
				System.out.println("Versión de la BBDD: " + meta.getDatabaseProductVersion());

				ResultSet columnas = meta.getColumns(null, null, "empleado", null);
				if (!columnas.isBeforeFirst()) {
					System.out.println(
							"No se encontraron columnas para la tabla 'empleados'. Verifica si existe la tabla.");
				} else {
					System.out.println("Consulta realizada");
					System.out.println("BBDD empresa");
					System.out.println("Columna   Tipo      Tamaño");
					System.out.println("............................");

					while (columnas.next()) {
						String nombrecol = columnas.getString("COLUMN_NAME");
						String tipo = columnas.getString("TYPE_NAME");
						String tamcol = columnas.getString("COLUMN_SIZE");
						System.out.println(nombrecol + " " + tipo + " " + tamcol);
					}
				}
				columnas.close();
			}
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println("Error al cerrar la conexión: " + e.getMessage());
				}
			}
		}

	}

}

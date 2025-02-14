package tablaEmpleados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio13ConsultarRegistroEmpleados {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		Statement stmt = null;
		String sql = "SELECT * FROM empleados WHERE id = 1";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
			stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String email = rs.getString("email");
				String telefono = rs.getString("telefono");
				String direccion = rs.getString("direccion");
				String salario = rs.getString("salario");
				String fecha_contratacion = rs.getString("fecha_contratacion");
				System.out.println("id: " + id + ", nombre: " + nombre + ", apellido: " + apellido + ", email: " + email
						+ ", telefono: " + telefono + ", dirección: " + direccion + ", salario: " + salario
						+ ", fecha_contratacion: " + fecha_contratacion);
			}
			conn.close();
			stmt.close();
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

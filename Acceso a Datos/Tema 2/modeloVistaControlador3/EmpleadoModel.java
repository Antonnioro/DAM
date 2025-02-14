package modeloVistaControlador3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoModel {

	private Connection conn;

	public EmpleadoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {

		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	public List<Empleado> getAllEmpleados() throws SQLException {
		List<Empleado> empleados = new ArrayList<>();

		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM empleados");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			String apellido = rs.getString("apellido");
			String email = rs.getString("email");
			String telefono = rs.getString("telefono");
			String direccion = rs.getString("direccion");
			double salario = rs.getDouble("salario");
			String fecha_contratacion = rs.getString("fecha_contratacion");
			empleados.add(new Empleado(id, nombre, apellido, email, telefono, direccion, salario, fecha_contratacion));
		}

		stmt.close();
		rs.close();
		return empleados;
	}

	public void close() throws SQLException {
		conn.close();
	}

}

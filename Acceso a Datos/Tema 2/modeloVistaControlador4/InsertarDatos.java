package modeloVistaControlador4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		Statement stmt = null;
		
		String sqlAlumnos = "INSERT INTO alumnos (id, nif, nombre, apellido, edad)" + "VALUES (2, 'A002', 'Estefania', 'Perez', 20)";

		String sqlProfesores = "INSERT INTO profesores (id, nif, nombre, apellido, salario)" + "VALUES (2, 'P002', 'Manolo', 'Olmedo', 2000.01)";
		
		String sqlCursos = "INSERT INTO cursos (id, codigo, nombre, capacidad)" + "VALUES (2, 'C002', 'DAW', 25)";
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/instituto", "root", "");
			stmt = conn.createStatement();
			
			stmt.executeUpdate(sqlAlumnos);
			System.out.println("Datos insertados en la tabla alumnos");
			
			stmt.executeUpdate(sqlProfesores);
			System.out.println("Datos insertados en la tabla profesores");
			
			stmt.executeUpdate(sqlCursos);
			System.out.println("Datos insertados en la tabla cursos");
			
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

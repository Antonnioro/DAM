package modeloVistaControlador4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTablas {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		String sqlAlumnos = "CREATE TABLE alumnos (id INT PRIMARY KEY," + "nif VARCHAR(10) NOT NULL,"
				+ "nombre VARCHAR(60) NOT NULL," + "apellido VARCHAR(60) NOT NULL," + "edad VARCHAR(2))";

		String sqlProfesores = "CREATE TABLE profesores (id INT PRIMARY KEY," + "nif VARCHAR(10) NOT NULL,"
				+ "nombre VARCHAR(60) NOT NULL," + "apellido VARCHAR(60) NOT NULL," + "salario DECIMAL(6, 2))";

		String sqlCursos = "CREATE TABLE cursos (id INT PRIMARY KEY," + "codigo VARCHAR(5) NOT NULL," + "nombre VARCHAR(60) NOT NULL,"
				+ "capacidad INT NOT NULL)";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/instituto", "root", "");
			stmt = conn.createStatement();

			stmt.execute(sqlAlumnos);
			System.out.println("Creada la tabla alumnos");

			stmt.execute(sqlProfesores);
			System.out.println("Creada la tabla profesores");
			
			stmt.execute(sqlCursos);
			System.out.println("Creada la tabla cursos");
			
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

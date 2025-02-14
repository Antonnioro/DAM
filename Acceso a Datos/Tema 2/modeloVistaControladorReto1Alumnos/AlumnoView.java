package modeloVistaControladorReto1Alumnos;

import java.util.List;

public class AlumnoView {

	public void mostrarAlumnos(List<Alumno> alumnos) {
		for (Alumno alumno : alumnos) {
			System.out.println("ID: " + alumno.getId());
			System.out.println("Nif: " + alumno.getNif());
			System.out.println("Nombre: " + alumno.getNombre());
			System.out.println("Apellido: " + alumno.getApellido());
			System.out.println("Edad: " + alumno.getEdad());
			System.out.println();
		}
	}

}

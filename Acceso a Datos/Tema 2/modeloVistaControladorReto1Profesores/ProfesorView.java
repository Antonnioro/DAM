package modeloVistaControladorReto1Profesores;

import java.util.List;

public class ProfesorView {
	
	public void mostrarProfesor(List<Profesor> profesores) {
		for (Profesor profesor : profesores) {
			System.out.println("ID: " + profesor.getId());
			System.out.println("Nif: " + profesor.getNif());
			System.out.println("Nombre: " + profesor.getNombre());
			System.out.println("Apellido: " + profesor.getApellido());
			System.out.println("Salario: " + profesor.getSalario());
			System.out.println();
		}
	}

}

package modeloVistaControladorReto1Cursos;

import java.util.List;

public class CursoView {

	public void mostrarCursos(List<Curso> cursos) {
		for (Curso curso : cursos) {

			System.out.println("ID: " + curso.getId());
			System.out.println("Codigo: " + curso.getCodigo());
			System.out.println("Nombre: " + curso.getNombre());
			System.out.println("Capacidad: " + curso.getCapacidad());
			System.out.println();

		}
	}

}

package com.example.spring_mysql;

import com.example.spring_mysql.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Marca esta clase como un servicio de Spring, lo que indica que es un
			// componente de servicio donde reside la lógica de negocio.
public class AlumnoService {

	@Autowired // Inyección de dependencias de Spring. Inyecta automáticamente una instancia
				// del repositorio AlumnoRepository.
	private AlumnoRepository alumnoRepository;

	// Método para obtener todos los alumnos
	public List<Alumno> obtenerTodos() {
		// Llama al método findAll del repositorio para recuperar todos los alumnos de
		// la base de datos
		return alumnoRepository.findAll();
	}

	// Método para obtener un alumno por su ID
	public Alumno obtenerPorId(Long id) {
		// Llama al método findById del repositorio para recuperar un alumno por su ID
		// Utiliza orElse(null) para devolver null si no se encuentra el alumno
		return alumnoRepository.findById(id).orElse(null);
	}

	// Método para guardar o actualizar un alumno
	public Alumno guardarAlumno(Alumno alumno) {
		// Llama al método save del repositorio para guardar el alumno en la base de
		// datos
		return alumnoRepository.save(alumno);
	}

	// Método para eliminar un alumno por su ID
	public void eliminarAlumno(Long id) {
		// Llama al método deleteById del repositorio para eliminar el alumno por su ID
		alumnoRepository.deleteById(id);
	}
}

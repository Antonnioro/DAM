package com.example.spring_mysql;

import com.example.spring_mysql.Alumno;
import com.example.spring_mysql.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Anotación que indica que esta clase es un controlador de Spring que manejará
				// solicitudes HTTP y devolverá datos JSON o XML.
@RequestMapping("/api/alumnos") // Establece la ruta base para todos los endpoints definidos en esta clase.
public class AlumnoController {

	@Autowired // Inyección de dependencias automática del servicio AlumnoService.
	private AlumnoService alumnoService;

	@GetMapping // Maneja solicitudes GET en la ruta "/api/alumnos".
	public List<Alumno> obtenerTodos() {
		// Llama al servicio para obtener todos los alumnos y los devuelve.
		return alumnoService.obtenerTodos();
	}

	@GetMapping("/{id}") // Maneja solicitudes GET en la ruta "/api/alumnos/{id}".
	public Alumno obtenerPorId(@PathVariable Long id) {
		// Llama al servicio para obtener un alumno por su ID y lo devuelve.
		return alumnoService.obtenerPorId(id);
	}

	@PostMapping // Maneja solicitudes POST en la ruta "/api/alumnos".
	public Alumno guardarAlumno(@RequestBody Alumno alumno) {
		// Llama al servicio para guardar un nuevo alumno y lo devuelve.
		// @RequestBody indica que el cuerpo de la solicitud HTTP contiene los datos del
		// alumno en formato JSON.
		return alumnoService.guardarAlumno(alumno);
	}

	@DeleteMapping("/{id}") // Maneja solicitudes DELETE en la ruta "/api/alumnos/{id}".
	public void eliminarAlumno(@PathVariable Long id) {
		// Llama al servicio para eliminar un alumno por su ID.
		alumnoService.eliminarAlumno(id);
	}
}

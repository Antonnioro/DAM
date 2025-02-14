package com.example.spring_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudiantesController {

	@Autowired
	private EstudiantesService estudiantesService;

	@GetMapping
	public List<Estudiantes> obtenerTodos() {
		return estudiantesService.obtenerTodos();
	}

	@GetMapping("/{id}")
	public Estudiantes obtenerPorId(@PathVariable Integer id) {
		return estudiantesService.obtenerPorId(id);
	}

	@PostMapping
	public Estudiantes guardarEstudiantes(@RequestBody Estudiantes estudiantes) {
		return estudiantesService.guardarEstudiantes(estudiantes);
	}

	@DeleteMapping("/{id}")
	public void eliminarEstudiantes(@PathVariable Integer id) {
		estudiantesService.eliminarEstudiantes(id);
	}
}

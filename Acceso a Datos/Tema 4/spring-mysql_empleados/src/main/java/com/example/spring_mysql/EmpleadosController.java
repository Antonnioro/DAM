package com.example.spring_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadosController {

	@Autowired
	private EmpleadosService empleadosService;

	@GetMapping
	public List<Empleados> obtenerTodos() {
		return empleadosService.obtenerTodos();
	}

	@GetMapping("/{id}")
	public Empleados obtenerPorId(@PathVariable Integer id) {
		return empleadosService.obtenerPorId(id);
	}

	@PostMapping
	public Empleados guardarEmpleados(@RequestBody Empleados empleados) {
		return empleadosService.guardarEmpleados(empleados);
	}

	@DeleteMapping("/{id}")
	public void eliminarEmpleados(@PathVariable Integer id) {
		empleadosService.eliminarEmpleados(id);
	}
}

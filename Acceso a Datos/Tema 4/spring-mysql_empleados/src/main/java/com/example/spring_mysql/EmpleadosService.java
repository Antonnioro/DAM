package com.example.spring_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadosService {

	@Autowired
	private EmpleadosRepository empleadosRepository;

	public List<Empleados> obtenerTodos() {
		return empleadosRepository.findAll();
	}

	public Empleados obtenerPorId(Integer id) {
		return empleadosRepository.findById(id).orElse(null);
	}

	public Empleados guardarEmpleados(Empleados empleados) {
		return empleadosRepository.save(empleados);
	}

	public void eliminarEmpleados(Integer id) {
		empleadosRepository.deleteById(id);
	}
}

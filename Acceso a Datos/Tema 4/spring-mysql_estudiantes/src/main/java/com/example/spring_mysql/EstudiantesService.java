package com.example.spring_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudiantesService {

	@Autowired
	private EstudiantesRepository estudiantesRepository;

	public List<Estudiantes> obtenerTodos() {
		return estudiantesRepository.findAll();
	}

	public Estudiantes obtenerPorId(Integer id) {
		return estudiantesRepository.findById(id).orElse(null);
	}

	public Estudiantes guardarEstudiantes(Estudiantes estudiantes) {
		return estudiantesRepository.save(estudiantes);
	}

	public void eliminarEstudiantes(Integer id) {
		estudiantesRepository.deleteById(id);
	}
}

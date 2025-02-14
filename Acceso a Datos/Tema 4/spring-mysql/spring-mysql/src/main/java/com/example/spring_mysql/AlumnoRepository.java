package com.example.spring_mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Anotación que indica que esta interfaz es un componente de Spring que
			// proporciona mecanismos de acceso a datos.
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
	// Esta interfaz hereda de JpaRepository, lo que proporciona métodos CRUD
	// estándar y más funcionalidades para la entidad Alumno.
	// No es necesario implementar estos métodos, ya que JpaRepository proporciona
	// implementaciones por defecto.

	// El tipo Alumno es la entidad que esta repositorio manejará.
	// Long es el tipo de dato de la clave primaria (ID) de la entidad Alumno.
}

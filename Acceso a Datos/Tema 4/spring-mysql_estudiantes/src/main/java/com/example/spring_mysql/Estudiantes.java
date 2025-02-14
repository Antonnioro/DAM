package com.example.spring_mysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estudiantes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String nombre;
	private String correo_electronico;
	private String telefono;
	private String curso;
	private String fecha_inscripcion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getFecha_inscripcion() {
		return fecha_inscripcion;
	}

	public void setFecha_inscripcion(String fecha_inscripcion) {
		this.fecha_inscripcion = fecha_inscripcion;
	}

}

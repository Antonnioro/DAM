package com.example.spring_mysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String nombre;
	private double precio;
	private int codigo_fabricante;

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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCodigo_fabricante() {
		return codigo_fabricante;
	}

	public void setCodigo_fabricante(int codigo_fabricante) {
		this.codigo_fabricante = codigo_fabricante;
	}

}

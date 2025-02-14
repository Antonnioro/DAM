package com.example.spring_mysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Compras {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int idcompras;
	private String fecha;
	private int id_producto;
	private int unidades;

	public int getIdcompras() {
		return idcompras;
	}

	public void setIdcompras(int idcompras) {
		this.idcompras = idcompras;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
}

package modelo1;

import javax.persistence.*;

@Entity
@Table(name = "cursos")

public class Cursos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "codigo")
	private String codigo;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "capacidad")
	private int capacidad;

	public Cursos() {

	}

	public Cursos(int id, String codigo, String nombre, int capacidad) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.capacidad = capacidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Cursos [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", capacidad=" + capacidad + "]";
	}

}

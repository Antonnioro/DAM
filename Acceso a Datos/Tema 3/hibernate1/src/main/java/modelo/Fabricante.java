package modelo;

import javax.persistence.*;

@Entity
@Table(name = "fabricante")

public class Fabricante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int id;

	@Column(name = "nombre")
	private String nombre;

	public Fabricante() {
	}

	public Fabricante(String nombre) {
		this.nombre = nombre;
	}

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

	@Override
	public String toString() {
		return "fabricante{" + "id=" + id + ", nombre='" + nombre + '\'' + '}';
	}

}

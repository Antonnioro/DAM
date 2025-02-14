package modelo;

import javax.persistence.*;

@Entity
@Table(name = "alumnos")

public class Alumnos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nif")
	private String nif;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "edad")
	private int edad;

	public Alumnos() {

	}

	public Alumnos(int id, String nif, String nombre, String apellido, int edad) {
		this.id = id;
		this.nif = nif;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumnos [id=" + id + ", nif=" + nif + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ "]";
	}

}

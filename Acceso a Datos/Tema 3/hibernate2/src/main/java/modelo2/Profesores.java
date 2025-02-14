package modelo2;

import javax.persistence.*;

@Entity
@Table(name = "profesores")

public class Profesores {

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

	@Column(name = "salario")
	private double salario;

	public Profesores() {

	}

	public Profesores(int id, String nif, String nombre, String apellido, double salario) {
		this.id = id;
		this.nif = nif;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Profesores [id=" + id + ", nif=" + nif + ", nombre=" + nombre + ", apellido=" + apellido + ", salario="
				+ salario + "]";
	}

}

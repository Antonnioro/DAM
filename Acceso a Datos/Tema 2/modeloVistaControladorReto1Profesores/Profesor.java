package modeloVistaControladorReto1Profesores;

public class Profesor {

	private int id;
	private String nif;
	private String nombre;
	private String apellido;
	private double salario;

	public Profesor(int id, String nif, String nombre, String apellido, double salario) {
		this.id = id;
		this.nif = nif;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public String getNif() {
		return nif;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public double getSalario() {
		return salario;
	}

}

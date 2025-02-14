package modeloVistaControladorReto1Alumnos;

public class Alumno {

	private int id;
	private String nif;
	private String nombre;
	private String apellido;
	private int edad;

	public Alumno(int id, String nif, String nombre, String apellido, int edad) {
		this.id = id;
		this.nif = nif;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
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

	public int getEdad() {
		return edad;
	}

}

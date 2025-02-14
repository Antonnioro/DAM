package modeloVistaControladorReto1Cursos;

public class Curso {

	private int id;
	private String codigo;
	private String nombre;
	private int capacidad;

	public Curso(int id, String codigo, String nombre, int capacidad) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.capacidad = capacidad;
	}

	public int getId() {
		return id;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

}

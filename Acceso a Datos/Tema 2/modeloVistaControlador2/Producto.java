package modeloVistaControlador2;

public class Producto {

	private int id;
	private String codigo;
	private String nombre;
	private double precio;

	public Producto(int id, String codigo, String nombre, double precio) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
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

	public double getPrecio() {
		return precio;
	}

}

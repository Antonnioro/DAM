package modeloVistaControlador3;

public class Empleado {

	private int id;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String direccion;
	private double salario;
	private String fecha_contratacion;

	public Empleado(int id, String nombre, String apellido, String email, String telefono, String direccion,
			double salario, String fecha_contratacion) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
		this.salario = salario;
		this.fecha_contratacion = fecha_contratacion;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getSalario() {
		return salario;
	}

	public String getFecha_contratacion() {
		return fecha_contratacion;
	}

}

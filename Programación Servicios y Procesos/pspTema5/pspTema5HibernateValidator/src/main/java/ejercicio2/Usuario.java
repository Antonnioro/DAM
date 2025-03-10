package ejercicio2;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;

public class Usuario {

	@NotBlank(message = "El nombre no puede estar vacío")
	private String nombre;

	@Min(value = 18, message = "La edad debe ser mayor o igual a 18 años.")
	private int edad;

	public Usuario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}

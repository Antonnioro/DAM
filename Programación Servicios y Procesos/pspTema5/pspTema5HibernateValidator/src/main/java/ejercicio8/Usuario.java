package ejercicio8;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

public class Usuario {

	@NotBlank(message = "El nombre no puede estar vacío")
	private String nombre;

	@Email(message = "Debes meter un email válido")
	private String email;

	@Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).*$", message = "Debe contener al menos una mayúscula, una minúscula y un número")
	private String password;

	public Usuario(String nombre, String email, String password) {
		this.nombre = nombre;
		this.email = email;
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

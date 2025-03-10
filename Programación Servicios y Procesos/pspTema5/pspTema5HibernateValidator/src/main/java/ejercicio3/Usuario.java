package ejercicio3;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Usuario {

	@Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).*$", message = "Debe contener al menos una mayúscula, una minúscula y un número")
	private String password;

	public Usuario(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

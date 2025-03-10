package ejercicio1;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

public class Contacto {

	@Email(message = "Debes meter un email válido")
	private String email;

	@Pattern(regexp = "\\d{9}$", message = "El teléfono debe contener 9 dígitos")
	private String telefono;

	public Contacto(String email, String telefono) {
		this.email = email;
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}

package ejercicio1Prueba;

import jakarta.validation.constraints.NotBlank;

public class Prueba {

	@NotBlank(message = "El usuario no puede estar en blanco")
	private String usuario;

	public Prueba(String usuario) {
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}

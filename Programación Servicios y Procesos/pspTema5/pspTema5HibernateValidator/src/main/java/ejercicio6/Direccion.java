package ejercicio6;

import jakarta.validation.constraints.Pattern;

public class Direccion {

	@Pattern(regexp = "\\d{5}", message = "El código postal debe tener 5 dígitos")
	private String codigoPostal;

	public Direccion(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

}

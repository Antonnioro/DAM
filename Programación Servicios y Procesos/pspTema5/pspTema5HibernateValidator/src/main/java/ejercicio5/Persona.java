package ejercicio5;

import java.time.LocalDate;
import jakarta.validation.constraints.Past;

public class Persona {
	
	@Past(message = "La fecha de nacimiento debe estar en el pasado")
	private LocalDate fechaNacimiento;

	public Persona(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}

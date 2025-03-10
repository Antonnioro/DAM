package ejercicio5;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.ConstraintViolation;
import java.time.LocalDate;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Persona persona = new Persona(LocalDate.of(2025, 1, 1));
		Set<ConstraintViolation<Persona>> errores = validator.validate(persona);

		if (!errores.isEmpty()) {
			for (ConstraintViolation<Persona> error : errores) {
				System.out.println(error.getMessage());
			}
		} else {
			System.out.println("Fecha de nacimiento válida");
		}

	}
}
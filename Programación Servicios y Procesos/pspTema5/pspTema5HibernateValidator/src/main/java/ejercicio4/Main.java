package ejercicio4;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.ConstraintViolation;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Persona persona = new Persona("Nombre", 5.0, 3);
		Set<ConstraintViolation<Persona>> errores = validator.validate(persona);

		if (!errores.isEmpty()) {
			for (ConstraintViolation<Persona> error : errores) {
				System.out.println(error.getMessage());
			}
		} else {
			System.out.println("Persona válida");
		}
	}
}
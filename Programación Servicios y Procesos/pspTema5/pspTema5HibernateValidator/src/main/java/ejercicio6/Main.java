package ejercicio6;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.ConstraintViolation;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Direccion direccion = new Direccion("12345");
		Set<ConstraintViolation<Direccion>> errores = validator.validate(direccion);

		if (!errores.isEmpty()) {
			for (ConstraintViolation<Direccion> error : errores) {
				System.out.println(error.getMessage());
			}
		} else {
			System.out.println("Codigo postal válido");
		}
	}
}
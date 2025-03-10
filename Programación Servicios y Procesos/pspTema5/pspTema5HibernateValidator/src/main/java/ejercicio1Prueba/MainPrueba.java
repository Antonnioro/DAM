package ejercicio1Prueba;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.ConstraintViolation;
import java.util.Set;

public class MainPrueba {

	public static void main(String[] args) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Prueba usuario = new Prueba("Antonio");

		Set<ConstraintViolation<Prueba>> errores = validator.validate(usuario);

		if (!errores.isEmpty()) {
			for (ConstraintViolation<Prueba> error : errores) {
				System.out.println(error.getMessage());
			}
		} else {
			System.out.println("✅ Usuario válido");
		}
	}
}

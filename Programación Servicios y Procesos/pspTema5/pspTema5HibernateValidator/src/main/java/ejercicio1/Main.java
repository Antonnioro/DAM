package ejercicio1;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.ConstraintViolation;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Contacto contacto = new Contacto("alberto@cenecmalaga.es", "654789321");
		Set<ConstraintViolation<Contacto>> errores = validator.validate(contacto);

		if (!errores.isEmpty()) {
			for (ConstraintViolation<Contacto> error : errores) {
				System.out.println(error.getMessage());
			}
		} else {
			System.out.println("Contacto válido");
		}

	}

}

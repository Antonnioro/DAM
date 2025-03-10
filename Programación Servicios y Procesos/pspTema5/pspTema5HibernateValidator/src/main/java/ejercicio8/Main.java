package ejercicio8;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Usuario usuario = new Usuario("Antonio", "Antonio@gmail.com", "ContraseñaInventada123");
		Set<ConstraintViolation<Usuario>> errores = validator.validate(usuario);

		if (!errores.isEmpty()) {
			for (ConstraintViolation<Usuario> error : errores) {
				System.out.println(error.getMessage());
			}
		} else {
			System.out.println("Usuario válido");
		}

	}

}

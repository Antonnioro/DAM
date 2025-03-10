package ejercicio3;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.ConstraintViolation;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Usuario usuario1 = new Usuario("abc123");
		Usuario usuario2 = new Usuario("Password123");
		Usuario usuario3 = new Usuario("short");
		Usuario usuario4 = new Usuario("password");

		System.out.println("Validando usuario 1: ");
		validarUsuario(validator, usuario1);

		System.out.println("Validando usuario 2: ");
		validarUsuario(validator, usuario2);

		System.out.println("Validando usuario 3: ");
		validarUsuario(validator, usuario3);

		System.out.println("Validando usuario 4: ");
		validarUsuario(validator, usuario4);

	}

	private static void validarUsuario(Validator validator, Usuario usuario) {
		Set<ConstraintViolation<Usuario>> errores = validator.validate(usuario);

		if (!errores.isEmpty()) {
			for (ConstraintViolation<Usuario> error : errores) {
				System.out.println("Error: " + error.getMessage());
			}
		} else {
			System.out.println("Usuario válido");
		}
	}

}

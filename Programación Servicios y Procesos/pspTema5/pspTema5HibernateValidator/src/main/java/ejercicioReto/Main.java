package ejercicioReto;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.time.LocalDate;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		
		Formulario formulario = new Formulario("Antonio", "Rodríguez", 24, "654213978", "antonio@gmail.com", "32154", LocalDate.of(2000, 8, 18), LocalDate.of(2025, 6, 15), LocalDate.of(2025, 6, 10), "constrasenaInventada123", 19987.98);
		Set<ConstraintViolation<Formulario>> errores = validator.validate(formulario);
		
		if (!errores.isEmpty()) {
			for (ConstraintViolation<Formulario> error : errores) {
				System.out.println(error.getMessage());
			}
		} else {
			System.out.println("Formulario válido");
		}

	}

}

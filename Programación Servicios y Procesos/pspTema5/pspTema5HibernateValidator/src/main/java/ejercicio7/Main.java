package ejercicio7;

import java.time.LocalDate;
import java.util.Set;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class Main {
	public static void main(String[] args) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Reserva reserva = new Reserva(LocalDate.of(2025, 6, 15), LocalDate.of(2025, 6, 10));
		Set<ConstraintViolation<Reserva>> errores = validator.validate(reserva);

		if (!errores.isEmpty()) {
			for (ConstraintViolation<Reserva> error : errores) {
				System.out.println(error.getMessage());
			}
		} else {
			System.out.println("Reserva válida");
		}
	}
}

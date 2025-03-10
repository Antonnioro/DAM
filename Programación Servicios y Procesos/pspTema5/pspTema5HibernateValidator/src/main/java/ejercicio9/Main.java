package ejercicio9;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		
		Producto producto = new Producto("", 0, -1);
		Set<ConstraintViolation<Producto>> errores = validator.validate(producto);
		
		if (!errores.isEmpty()) {
			for (ConstraintViolation<Producto> error : errores) {
				System.out.println(error.getMessage());
			}
		} else {
			System.out.println("Producto válido");
		}
	}
}
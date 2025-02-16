package psp7;

import java.time.LocalDateTime;

public class Palabra {

	public static void main(String[] args) {

		String palabra = args[0];

		for (char c : palabra.toCharArray()) {
			String tipo;
			if (Character.isUpperCase(c)) {
				tipo = "Mayuscula";
			} else if (Character.isLowerCase(c)) {
				tipo = "Minuscula";
			} else if (Character.isDigit(c)) {
				tipo = "Numero";
			} else {
				tipo = "Otro";
			}

			System.out.println(LocalDateTime.now() + " ----- " + c + " : " + tipo);
		}

	}

}

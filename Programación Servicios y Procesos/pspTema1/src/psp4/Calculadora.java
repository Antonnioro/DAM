package psp4;

import java.util.Random;

public class Calculadora {

	public static void main(String[] args) {

		Random random = new Random();
		int numero = random.nextInt(10) + 1;

		int cuadrado = numero * numero;

		System.out.println("El cuadrado de " + numero + " es " + cuadrado);

	}

}

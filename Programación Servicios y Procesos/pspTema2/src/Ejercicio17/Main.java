package Ejercicio17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 5; i++) {
			int numero = i + 1;
			int exponente = 2;
			int resultado = (int) Math.pow(numero, exponente);
			pool.execute(() -> {
				System.out.println("La potencia de " + numero + " elevado a " + exponente + " es: " + resultado);

			});
		}
		pool.shutdown();
	}
}

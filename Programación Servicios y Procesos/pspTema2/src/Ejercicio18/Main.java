package Ejercicio18;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	private static final List<Integer> numeroPrimo = new ArrayList<>();

	public static void main(String[] args) {

		int[] numeros = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 17, 18, 19, 20 };

		ExecutorService pool = Executors.newFixedThreadPool(4);

		for (int num : numeros) {
			pool.execute(() -> {

				if (esPrimo(num)) {
					synchronized (numeroPrimo) {
						numeroPrimo.add(num);
					}
				}
			});
		}

		pool.shutdown();

		System.out.println("Números primos encontrados: " + numeroPrimo);
	}

	private static boolean esPrimo(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}

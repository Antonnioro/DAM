package EjercicioReto2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		int archivosTotales = 8;

		ExecutorService executor = Executors.newFixedThreadPool(4);

		for (int i = 1; i <= archivosTotales; i++) {
			int numero = i;
			executor.execute(() -> {
				String nombreHilo = Thread.currentThread().getName();
				System.out.println("Descarga del archivo " + numero + " iniciada por " + nombreHilo);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}

				System.out.println("Descarga del archivo " + numero + " completada por " + nombreHilo);
			});
		}

		executor.shutdown();

	}

}

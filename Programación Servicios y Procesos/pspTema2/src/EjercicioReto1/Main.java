package EjercicioReto1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {

	private static final int MAX_COCHES_EN_SEMAFORO = 3;
	private static final int TOTAL_COCHES = 5;

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(MAX_COCHES_EN_SEMAFORO);
		ExecutorService executor = Executors.newFixedThreadPool(TOTAL_COCHES);

		for (int i = 1; i <= TOTAL_COCHES; i++) {
			int cocheId = i;
			executor.submit(() -> {
				try {
					System.out.println("Coche-" + cocheId + " está esperando para pasar...");
					semaforo.acquire();
					System.out.println("Coche-" + cocheId + " está pasando por el semáforo...");
					Thread.sleep(2000);
					System.out.println("Coche-" + cocheId + " ha pasado.");
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					System.err.println("Coche-" + cocheId + " fue interrumpido.");
				} finally {
					semaforo.release();
				}
			});
		}

		executor.shutdown();

	}

}

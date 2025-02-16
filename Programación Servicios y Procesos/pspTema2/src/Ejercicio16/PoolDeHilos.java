package Ejercicio16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolDeHilos {
	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(3); // Se crea un ExecutorService con un pool de 3 hilos
																// fijos.

		// Ejecutar 6 tareas en el pool
		for (int i = 0; i < 6; i++) { // Iterar 6 veces para crear 6 tareas
			pool.execute(() -> { // Enviar una tarea al pool de hilos para su ejecución
				System.out.println("Tarea ejecutada por " + Thread.currentThread().getName()); // Imprimir el nombre del
																								// hilo que ejecuta la
																								// tarea
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}

		// Cerrar el pool de hilos
		pool.shutdown(); // Indicar que no se aceptarán más tareas y que el pool debe cerrarse una vez
							// que todas las tareas se completen.
	}
}

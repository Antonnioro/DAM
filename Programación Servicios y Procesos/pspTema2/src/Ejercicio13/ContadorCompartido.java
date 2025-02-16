package Ejercicio13;

public class ContadorCompartido {
	private int contador = 0; // Contador compartido entre los hilos

	// Método sincronizado para incrementar el contador
	public synchronized void incrementar() {
		contador++;
		System.out.println("Contador: " + contador);
	}

	public static void main(String[] args) {
		ContadorCompartido contador = new ContadorCompartido();

		Runnable tarea = () -> {
			for (int i = 0; i < 10; i++) {
				contador.incrementar();
			}
		};

		Thread hilo1 = new Thread(tarea);
		Thread hilo2 = new Thread(tarea);

		hilo1.start();
		hilo2.start();
	}
}

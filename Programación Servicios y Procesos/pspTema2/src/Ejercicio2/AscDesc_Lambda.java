package Ejercicio2;

public class AscDesc_Lambda {

	public static void main(String[] args) {

		/*
		 * Con Lambda no es necesario poner el metodo run o runnable
		 */

		Thread ascendente = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Ascendente: " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread descendente = new Thread(() -> {
			for (int i = 10; i >= 1; i--) {
				System.out.println("Descendente: " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Iniciar ambos hilos
		ascendente.start();
		descendente.start();
	}
}

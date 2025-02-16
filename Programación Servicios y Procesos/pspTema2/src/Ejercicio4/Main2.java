package Ejercicio4;

public class Main2 {

	public static void main(String[] args) {

		Thread hilo1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hilo 1 - Prioridad baja: " + i);
			}
		});

		hilo1.setPriority(Thread.MIN_PRIORITY);

		Thread hilo2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hilo 2 - Prioridad media: " + i);
			}
		});

		hilo2.setPriority(Thread.NORM_PRIORITY);

		Thread hilo3 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hilo 3 - Prioridad maxima: " + i);
			}
		});

		hilo3.setPriority(Thread.MAX_PRIORITY);

		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}
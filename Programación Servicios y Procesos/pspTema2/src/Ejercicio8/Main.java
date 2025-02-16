package Ejercicio8;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Thread hilo = new Thread(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hilo en ejecución");
		});

		System.out.println("Estado del hilo al crear: " + hilo.getState());
		hilo.start();
		System.out.println("Estado del hilo después de iniciar: " + hilo.getState());

		Thread.sleep(1000);
		System.out.println("Estado del hilo después de dormir 1 segundo: " + hilo.getState());

		hilo.join();
		System.out.println("Estado del hilo después de finalizar: " + hilo.getState());
	}
}


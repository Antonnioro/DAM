package Ejercicio9;

public class Main {

	public static void main(String[] args) {

		Thread corredor1 = new Thread(new Corredor("Corredor 1"));
		Thread corredor2 = new Thread(new Corredor("Corredor 2"));
		Thread corredor3 = new Thread(new Corredor("Corredor 3"));

		corredor1.start();
		corredor2.start();
		corredor3.start();
	}
}

class Corredor implements Runnable {
	private final String nombre;

	public Corredor(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void run() {
		int distanciaTotal = 0;
		while (distanciaTotal < 100) {
			int avance = (int) (Math.random() * 10) + 1;
			distanciaTotal += avance;
			System.out.println(nombre + " ha avanzado " + distanciaTotal + " metros.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(nombre + " ha terminado la carrera.");

	}

}

package Ejercicio10;

public class Main {

	public static void main(String[] args) {

		TirarDados jugador1 = new TirarDados("Jugador 1");
		TirarDados jugador2 = new TirarDados("Jugador 2");
		TirarDados jugador3 = new TirarDados("Jugador 3");

		Thread dados1 = new Thread(jugador1);
		Thread dados2 = new Thread(jugador2);
		Thread dados3 = new Thread(jugador3);

		dados1.start();
		dados2.start();
		dados3.start();

		try {
			dados1.join();
			dados2.join();
			dados3.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String ganador;
		if (jugador1.getPuntuacionTotal() > jugador2.getPuntuacionTotal()
				&& jugador1.getPuntuacionTotal() > jugador3.getPuntuacionTotal()) {
			ganador = "Jugador 1";
		} else if (jugador2.getPuntuacionTotal() > jugador1.getPuntuacionTotal()
				&& jugador2.getPuntuacionTotal() > jugador3.getPuntuacionTotal()) {
			ganador = "Jugador 2";
		} else if (jugador3.getPuntuacionTotal() > jugador1.getPuntuacionTotal()
				&& jugador3.getPuntuacionTotal() > jugador2.getPuntuacionTotal()) {
			ganador = "Jugador 3";
		} else {
			ganador = "Empate";
		}

		System.out.println("El ganador es: " + ganador);

	}

}

class TirarDados implements Runnable {
	private final String nombre;
	private int puntuacionTotal = 0;

	public TirarDados(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacionTotal() {
		return puntuacionTotal;
	}

	@Override
	public void run() {
		int turnoTirada = 0;
		while (turnoTirada < 5) {
			int resultado = (int) (Math.random() * 6) + 1;
			System.out.println(nombre + " ha lanzado los dados. Ha salido " + resultado);
			puntuacionTotal += resultado;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			turnoTirada++;
		}
		System.out.println(nombre + " ha sacado un total de " + puntuacionTotal + " puntos");
	}
}
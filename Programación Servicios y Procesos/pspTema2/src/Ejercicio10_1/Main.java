package Ejercicio10_1;

public class Main {

	public static void main(String[] args) {

		PiedraPapelTijeras jugador = new PiedraPapelTijeras("Jugador");
		PiedraPapelTijeras maquina = new PiedraPapelTijeras("Maquina");

		Thread hiloJugador = new Thread(jugador);
		Thread hiloMaquina = new Thread(maquina);

		hiloJugador.start();
		hiloMaquina.start();

		try {
			hiloJugador.join();
			hiloMaquina.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int puntuacionJugador = jugador.getPuntuacionTotal();
		int puntuacionMaquina = maquina.getPuntuacionTotal();

		String ganador;
		if (puntuacionJugador > puntuacionMaquina) {
			ganador = "Jugador";
		} else if (puntuacionMaquina > puntuacionJugador) {
			ganador = "Máquina";
		} else {
			ganador = "Empate";
		}

		System.out.println("Puntuación final - Jugador: " + puntuacionJugador + ", Máquina: " + puntuacionMaquina);
		System.out.println("El ganador es: " + ganador);

	}

}

class PiedraPapelTijeras implements Runnable {
	private final String nombre;
	private int puntuacionTotal = 0;

	public PiedraPapelTijeras(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacionTotal() {
		return puntuacionTotal;
	}

	@Override
	public void run() {
		int turnoTirada = 0;

		while (turnoTirada < 5) {
			int eleccion = (int) (Math.random() * 3) + 1;
			System.out.println(nombre + " ha elegido " + eleccion);

			int eleccionOponente = (int) (Math.random() * 3) + 1;
			System.out.println("Oponente ha elegido " + eleccionOponente);

			if (eleccion == 1 && eleccionOponente == 3 || eleccion == 2 && eleccionOponente == 1
					|| eleccion == 3 && eleccionOponente == 2) {
				System.out.println(nombre + " gana la ronda");
				puntuacionTotal++;
			} else if (eleccion == eleccionOponente) {
				System.out.println("Ronda empatada");
			} else {
				System.out.println(nombre + " pierde la ronda");
			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			turnoTirada++;
		}
		System.out.println(nombre + " ha acumulado " + puntuacionTotal + " puntos");
	}
}

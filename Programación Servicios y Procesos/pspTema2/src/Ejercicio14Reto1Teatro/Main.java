package Ejercicio14Reto1Teatro;

public class Main {
	private int asientosDisponibles = 20;

	public synchronized boolean venderAsiento(String agente) {
		if (asientosDisponibles > 0) {
			asientosDisponibles--;
			System.out.println(agente + " ha vendido un asiento. Asientos restantes: " + asientosDisponibles);
			return true;
		} else {
			System.out.println(agente + " no ha podido vender el asiento. No quedan asientos disponibles.");
			return false;
		}
	}

	public static void main(String[] args) {
		Main teatro = new Main();

		Runnable agenteVenta = () -> {
			String nombreAgente = Thread.currentThread().getName();
			while (teatro.venderAsiento(nombreAgente)) {
				try {
					Thread.sleep(100); // Simula el tiempo de venta
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread agente1 = new Thread(agenteVenta, "Agente 1");
		Thread agente2 = new Thread(agenteVenta, "Agente 2");
		Thread agente3 = new Thread(agenteVenta, "Agente 3");

		agente1.start();
		agente2.start();
		agente3.start();
	}

}

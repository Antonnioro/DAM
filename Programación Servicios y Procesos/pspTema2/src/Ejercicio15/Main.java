package Ejercicio15;

public class Main {

	private int dineroDisponible = 1000;
	private int dineroSacado = 300;

	public synchronized boolean sacarDinero(String agente) {
		if (dineroDisponible > 300) {
			dineroDisponible -= dineroSacado;
			System.out.println(agente + " ha retirado " + dineroSacado + " euros. Saldo restante: " + dineroDisponible + " euros.");
			return true;
		} else {
			System.out.println(agente + " no ha podido retirar " + dineroSacado + " euros. Saldo insuficiente: " + dineroDisponible + " euros.");
			return false;
		}
	}

	public static void main(String[] args) {
		Main teatro = new Main();

		Runnable agenteVenta = () -> {
			String nombreAgente = Thread.currentThread().getName();
			while (teatro.sacarDinero(nombreAgente)) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread agente1 = new Thread(agenteVenta, "Persona 1");
		Thread agente2 = new Thread(agenteVenta, "Persona 2");
		Thread agente3 = new Thread(agenteVenta, "Persona 3");

		agente1.start();
		agente2.start();
		agente3.start();
	}

}

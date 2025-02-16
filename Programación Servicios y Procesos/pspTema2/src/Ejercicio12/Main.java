package Ejercicio12;

import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		Timer temporizador = new Timer();
		temporizador.scheduleAtFixedRate(new Tarea(), 0, 1000);

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		temporizador.cancel();
	}
}

class Tarea extends TimerTask {
	@Override
	public void run() {
		System.out.println("Hora actual: " + LocalTime.now());
	}
}
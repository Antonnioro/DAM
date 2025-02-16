package Ejercicio3;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	private static final int LIMITE = 5;
	private final Queue<Integer> cola = new LinkedList<>();

	public synchronized void producir(int valor) throws InterruptedException {
		while (cola.size() == LIMITE) {
			wait();
		}
		cola.add(valor);
		System.out.println("Producido: " + valor);
		notifyAll();
	}

	public synchronized void consumir() throws InterruptedException {
		while (cola.isEmpty()) {
			wait();
		}
		int valor = cola.poll();
		System.out.println("Consumido: " + valor);
		notifyAll();
	}

	public static void main(String[] args) {
		Main buffer = new Main();

		Thread productor = new Thread(() -> {
			int valor = 0;
			while (true) {
				try {
					buffer.producir(valor++);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumidor = new Thread(() -> {
			while (true) {
				try {
					buffer.consumir();
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		productor.start();
		consumidor.start();
	}
}

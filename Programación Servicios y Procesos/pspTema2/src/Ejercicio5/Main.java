package Ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		double num1, num2;

		System.out.println("Introduce el primer número:");
		num1 = t.nextDouble();

		System.out.println("Introduce el segundo número:");
		num2 = t.nextDouble();

		Thread suma = new HiloSuma(num1, num2);
		Thread dobleSuma = new HiloDobleSuma(num1);
		Thread resta = new HiloResta(num1, num2);
		Thread multiplicacion = new HiloMultiplicacion(num1, num2);
		Thread division = new HiloDivision(num1, num2);
		Thread raizCuadrada = new HiloRaizCuadrada(num1);

		suma.setPriority(Thread.NORM_PRIORITY);
		dobleSuma.setPriority(Thread.MIN_PRIORITY);
		resta.setPriority(Thread.NORM_PRIORITY);
		multiplicacion.setPriority(Thread.MAX_PRIORITY);
		division.setPriority(Thread.NORM_PRIORITY);
		raizCuadrada.setPriority(Thread.MIN_PRIORITY);

		suma.start();
		dobleSuma.start();
		resta.start();
		multiplicacion.start();
		division.start();
		raizCuadrada.start();
	}
}

class HiloSuma extends Thread {
	private double num1, num2;

	public HiloSuma(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void run() {
		System.out.println("Resultado de suma (" + num1 + ", " + num2 + "): " + (num1 + num2) + " prioridad del hilo: "
				+ getPriority());
	}
}

class HiloDobleSuma extends Thread {
	private double num1;

	public HiloDobleSuma(double num1) {
		this.num1 = num1;
	}

	public void run() {
		System.out.println(
				"Resultado de doble suma (" + num1 + "): " + (num1 + num1) + " prioridad del hilo: " + getPriority());
	}
}

class HiloResta extends Thread {
	private double num1, num2;

	public HiloResta(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void run() {
		System.out.println("Resultado de resta (" + num1 + ", " + num2 + "): " + (num1 - num2) + " prioridad del hilo: "
				+ getPriority());
	}
}

class HiloMultiplicacion extends Thread {
	private double num1, num2;

	public HiloMultiplicacion(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void run() {
		System.out.println("Resultado de multiplicación (" + num1 + ", " + num2 + "): " + (num1 * num2)
				+ " prioridad del hilo: " + getPriority());
	}
}

class HiloDivision extends Thread {
	private double num1, num2;

	public HiloDivision(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void run() {
		if (num2 != 0) {
			System.out.println("Resultado de división (" + num1 + ", " + num2 + "): " + (num1 / num2)
					+ " prioridad del hilo: " + getPriority());
		} else {
			System.out.println("Error: División por cero.");
		}
	}
}

class HiloRaizCuadrada extends Thread {
	private double num1;

	public HiloRaizCuadrada(double num1) {
		this.num1 = num1;
	}

	public void run() {
		if (num1 >= 0) {
			System.out.println("Resultado de raíz cuadrada (" + num1 + "): " + Math.sqrt(num1) + " prioridad del hilo: "
					+ getPriority());
		} else {
			System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
		}
	}
}

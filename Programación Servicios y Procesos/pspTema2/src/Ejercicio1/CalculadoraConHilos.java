package Ejercicio1;

import java.util.Scanner;

public class CalculadoraConHilos {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		double num1, num2;

		System.out.println("Introduce el primer número:");
		num1 = t.nextDouble();

		System.out.println("Introduce el segundo número:");
		num2 = t.nextDouble();

		new HiloSuma(num1, num2).start();
		new HiloDobleSuma(num1).start();
		new HiloResta(num1, num2).start();
		new HiloMultiplicacion(num1, num2).start();
		new HiloDivision(num1, num2).start();
	}
}

class HiloSuma extends Thread {
	private double num1, num2;

	public HiloSuma(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void run() {
		System.out.println("Suma: " + (num1 + num2));
	}

}

class HiloDobleSuma extends Thread {
	private double num1;

	public HiloDobleSuma(double num1) {
		this.num1 = num1;
	}

	public void run() {
		System.out.println("Doble Suma: " + (num1 + num1));
	}

}

class HiloResta extends Thread {
	private double num1, num2;

	public HiloResta(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void run() {
		System.out.println("Resta: " + (num1 - num2));
	}

}

class HiloMultiplicacion extends Thread {
	private double num1, num2;

	public HiloMultiplicacion(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void run() {
		System.out.println("Multiplicación: " + (num1 * num2));
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
			System.out.println("División: " + (num1 / num2));
		} else {
			System.out.println("Error: Division por cero.");
		}

	}

}
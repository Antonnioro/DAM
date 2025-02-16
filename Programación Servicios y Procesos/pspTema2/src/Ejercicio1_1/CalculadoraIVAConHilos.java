package Ejercicio1_1;

import java.util.Scanner;

public class CalculadoraIVAConHilos {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		double precio, unidades, descuento;

		System.out.println("Introduce el precio:");
		precio = t.nextDouble();

		System.out.println("Introduce las unidades:");
		unidades = t.nextDouble();

		System.out.println("Introduce el descuento:");
		descuento = t.nextDouble();

		new Hilo7(precio, unidades).start();
		new Hilo10(precio, unidades).start();
		new Hilo21(precio, unidades).start();
		new Hilo21Descuentos(precio, unidades, descuento).start();
	}
}

class Hilo7 extends Thread {
	private double precio, unidades;

	public Hilo7(double precio, double unidades) {
		this.precio = precio;
		this.unidades = unidades;
	}

	public void run() {
		double total = (precio * unidades) * 1.07;
		System.out.println("IVA al 7%: " + total);
	}

}

class Hilo10 extends Thread {
	private double precio, unidades;

	public Hilo10(double precio, double unidades) {
		this.precio = precio;
		this.unidades = unidades;
	}

	public void run() {
		double total = (precio * unidades) * 1.1;
		System.out.println("IVA al 10%: " + total);
	}

}

class Hilo21 extends Thread {
	private double precio, unidades;

	public Hilo21(double precio, double unidades) {
		this.precio = precio;
		this.unidades = unidades;
	}

	public void run() {
		double total = (precio * unidades) * 1.21;
		System.out.println("IVA al 21%: " + total);
	}
}

class Hilo21Descuentos extends Thread {
	private double precio, unidades, descuento;

	public Hilo21Descuentos(double precio, double unidades, double descuento) {
		this.precio = precio;
		this.unidades = unidades;
		this.descuento = descuento;
	}

	public void run() {
		double total = precio * unidades;
		double totalDescontado = total - (total * (descuento / 100));
		double totalFinal = totalDescontado * 1.21;
		System.out.println("IVA al 21% con descuento: " + totalFinal);
	}
}
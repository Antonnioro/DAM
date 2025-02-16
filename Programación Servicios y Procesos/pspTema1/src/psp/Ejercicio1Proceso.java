package psp;

import java.io.IOException;

public class Ejercicio1Proceso {

	public static void main(String[] args) throws IOException {
		ProcessBuilder proceso, proceso2, proceso3;
		System.out.println("Abriendo el Bloc de Notas");
		proceso = new ProcessBuilder("C:/Windows/notepad.exe"); // Indica ruta del ejecutable
		proceso.start(); // Abre el programa

		System.out.println("Abriendo la calculadora");
		proceso2 = new ProcessBuilder("C:/Windows/System32/calc.exe");
		proceso2.start();

		System.out.println("Abriendo el Explorador de Archivos");
		proceso3 = new ProcessBuilder("C:/Windows/explorer.exe");
		proceso3.start();

	}

}
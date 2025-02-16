package pspReto1;

import java.io.File;

public class Principal {

	public static void main(String[] args) {

		try {
			ProcessBuilder proceso, proceso2;

			proceso = new ProcessBuilder("C:/Windows/notepad.exe");
			proceso.start();
			System.out.println("Bloc de notas iniciado");

			proceso.redirectOutput(new File("Bloc de Notas.txt"));

			proceso2 = new ProcessBuilder("C:/Windows/System32/calc.exe");
			proceso2.start();
			System.out.println("Calculadora iniciada");

			proceso2.redirectOutput(new File("Calculadora.txt"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

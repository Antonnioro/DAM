package psp6;

import java.io.File;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {

		try {

			String classpath = System.getProperty("java.class.path");

			// El 3, 6 y 9 son argumentos.

			ProcessBuilder proceso1 = new ProcessBuilder("java", "-cp", classpath, "psp6.Tabla", "3");
			ProcessBuilder proceso2 = new ProcessBuilder("java", "-cp", classpath, "psp6.Tabla", "6");
			ProcessBuilder proceso3 = new ProcessBuilder("java", "-cp", classpath, "psp6.Tabla", "9");

			proceso1.redirectOutput(new File("salida1.txt"));
			proceso2.redirectOutput(new File("salida2.txt"));
			proceso3.redirectOutput(new File("salida3.txt"));

			Process pr1 = proceso1.start();
			Process pr2 = proceso2.start();
			Process pr3 = proceso3.start();

			pr1.waitFor();
			pr2.waitFor();
			pr3.waitFor();

			System.out.println("Todos los procesos han terminado. Revise los archivos de salida.");

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}

}
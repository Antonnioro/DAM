package psp7;

import java.io.File;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		try {

			String classpath = System.getProperty("java.class.path");

			ProcessBuilder proceso1 = new ProcessBuilder("java", "-cp", classpath, "psp7.Palabra", "Proceso");
			ProcessBuilder proceso2 = new ProcessBuilder("java", "-cp", classpath, "psp7.Palabra", "Cocodrilo");
			ProcessBuilder proceso3 = new ProcessBuilder("java", "-cp", classpath, "psp7.Palabra", "Java16");

			proceso1.redirectOutput(new File("palabra1.txt"));
			proceso2.redirectOutput(new File("palabra2.txt"));
			proceso3.redirectOutput(new File("palabra3.txt"));

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

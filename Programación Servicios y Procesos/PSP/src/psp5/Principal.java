package psp5;

import java.io.File;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {

		try {

			String classpath = System.getProperty("java.class.path");

			ProcessBuilder proceso1 = new ProcessBuilder("java", "-cp", classpath, "psp5.Generador");

			proceso1.redirectOutput(new File("numero.txt"));

			ProcessBuilder proceso2 = new ProcessBuilder("java", "-cp", classpath, "psp5.Tabla");

			proceso2.redirectInput(new File("numero.txt"));
			proceso2.redirectOutput(new File("salida.txt"));

			Process process = proceso1.start();

			int exitCode = process.waitFor();

			if (exitCode == 0) {
				System.out.println("El proceso Generador se ejecutó correctamente");
			} else {
				System.out.println("El proceso Generador terminó con errores");
			}

			Process process2 = proceso2.start();

			int exitCode2 = process2.waitFor();

			if (exitCode2 == 0) {
				System.out.println("El proceso Tabla se ejecutó correctamente");
			} else {
				System.out.println("El proceso Tabla terminó con errores");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

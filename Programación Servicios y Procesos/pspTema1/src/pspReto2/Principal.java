package pspReto2;

import java.io.File;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		try {
			String classpath = System.getProperty("java.class.path");
			ProcessBuilder proceso1 = new ProcessBuilder("java", "-cp", classpath, "pspReto2.Calculo", "5", "5",
					"suma");
			proceso1.redirectOutput(new File("suma.txt"));
			Process pr1 = proceso1.start();
			pr1.waitFor();
			ProcessBuilder proceso2 = new ProcessBuilder("java", "-cp", classpath, "pspReto2.Calculo", "5", "5",
					"resta");
			proceso2.redirectOutput(new File("resta.txt"));
			Process pr2 = proceso2.start();
			pr2.waitFor();
			ProcessBuilder proceso3 = new ProcessBuilder("java", "-cp", classpath, "pspReto2.Calculo", "5", "5",
					"multiplicacion");
			proceso3.redirectOutput(new File("multiplicacion.txt"));
			Process pr3 = proceso3.start();
			pr3.waitFor();
			ProcessBuilder proceso4 = new ProcessBuilder("java", "-cp", classpath, "pspReto2.Calculo", "5", "5",
					"division");
			proceso4.redirectOutput(new File("division.txt"));
			Process pr4 = proceso4.start();
			pr4.waitFor();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}

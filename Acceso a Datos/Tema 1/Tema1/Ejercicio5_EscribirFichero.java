package Tema1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ejercicio5_EscribirFichero {

	public static void main(String[] args) {

		FileWriter miFichero = null;
		PrintWriter escribir = null;

		String rutaCarpeta = "c:\\prueba\\ejercicio1";
		String nombreFichero = "malaga.txt";

		File fichero = new File(rutaCarpeta, nombreFichero);

		new File(rutaCarpeta).mkdir();

		try {
			miFichero = new FileWriter(fichero);
			escribir = new PrintWriter(miFichero);

			for (int i = 0; i < 10; i++) {
				escribir.println("Linea: " + i);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (miFichero != null) {
					miFichero.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}

package Tema1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		FileWriter miFichero = null;
		PrintWriter escribir = null;

		String rutaCarpeta = "c:\\prueba\\ejercicio2";
		String nombreFichero = "sevilla.txt";

		File fichero = new File(rutaCarpeta, nombreFichero);

		new File(rutaCarpeta).mkdir();

		try {

			miFichero = new FileWriter(fichero);
			escribir = new PrintWriter(miFichero);

			Scanner t = new Scanner(System.in);
			System.out.println("Escribe tu nombre");
			String nombre = t.nextLine();

			System.out.println("Introduce la cantidad de veces que quieres que se repita");
			int cantidad = t.nextInt();

			for (int i = 0; i < cantidad; i++) {
				escribir.println(i + ". " + nombre);
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

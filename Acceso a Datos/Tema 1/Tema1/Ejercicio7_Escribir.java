package Tema1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio7_Escribir {

	public static void main(String[] args) {

		FileWriter miFichero = null;
		PrintWriter escribir = null;

		String rutaCarpeta = "C:\\prueba";
		String nombreFichero = "alumnos2.csv";
		File fichero = new File(rutaCarpeta, nombreFichero);

		new File(rutaCarpeta).mkdirs();

		try {
			miFichero = new FileWriter(fichero);
			escribir = new PrintWriter(miFichero);

			System.out.println("Introduce un texto en mayúsculas:");
			Scanner t = new Scanner(System.in);
			String cadena = t.nextLine();

			// Cambia el texto a minúsculas
			String textoM = cadena.toLowerCase();

			escribir.println(textoM);

			miFichero.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

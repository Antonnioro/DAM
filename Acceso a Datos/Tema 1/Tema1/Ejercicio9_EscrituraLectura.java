package Tema1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio9_EscrituraLectura {

	public static void main(String[] args) {

		String[] frutas = { "Naranja", "Mango", "Chirimoya", "Fresa" };
		String archivo = "c://prueba//Frutas.txt";

		try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo))) {

			for (String fruta : frutas) {
				escritor.write(fruta);
				escritor.newLine();
			}

			System.out.println("Frutas guardadas en " + archivo);

		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero Frutas.txt");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero Frutas.txt");
		}

		try {

			BufferedReader br = new BufferedReader(new FileReader("C://prueba//Frutas.txt"));

			String linea = "";

			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}

			br.close();

		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero frutas.txt");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero frutas.txt");
		}

	}

}

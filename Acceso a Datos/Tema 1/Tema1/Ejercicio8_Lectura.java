package Tema1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio8_Lectura {

	public static void main(String[] args) {

		try {

			BufferedReader br = new BufferedReader(new FileReader("C://prueba//malaga.txt"));

			String linea = "";

			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}

			br.close();

		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero malaga.txt");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero malaga.txt");
		}

	}

}

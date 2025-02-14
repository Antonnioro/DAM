package Tema1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio10_LeerTresFicheros {

	public static void main(String[] args) {

		try {
			BufferedReader br1 = new BufferedReader(new FileReader("c://prueba//malaga.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("c://prueba//Frutas.txt"));
			BufferedReader br3 = new BufferedReader(new FileReader("c://prueba//Union.txt"));

			BufferedWriter bw = new BufferedWriter(new FileWriter("c://prueba//Union2.txt"));

			String linea1 = "";
			String linea2 = "";
			String linea3 = "";

			while (linea1 != null || linea2 != null || linea3 != null) {
				linea1 = br1.readLine();
				linea2 = br2.readLine();
				linea3 = br3.readLine();

				if (linea1 != null) {
					bw.write(linea1 + "\n");
				}

				if (linea2 != null) {
					bw.write(linea2 + "\n");
				}

				if (linea3 != null) {
					bw.write(linea3 + "\n");
				}

			}

			System.out.println("Proceso realizado con éxito");

			br1.close();
			br2.close();
			br3.close();
			bw.close();

		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentran los ficheros");
		} catch (IOException ioe) {
			System.out.println("No se puede leer los ficheros");
		}

	}

}

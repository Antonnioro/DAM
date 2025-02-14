package Tema1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio11_UnionDosFicheros {

	public static void main(String[] args) {

		String[] clientesA = { "Alberto", "Laura", "Eva" };
		String archivoA = "c://prueba//Oficina A.txt";

		try (BufferedWriter escritorA = new BufferedWriter(new FileWriter(archivoA))) {

			for (String oficinaA : clientesA) {
				escritorA.write(oficinaA);
				escritorA.newLine();
			}

			System.out.println("Datos guardados en " + archivoA);

		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero Oficina A.txt");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero Oficina A.txt");
		}

		String[] clientesB = { "Paco", "Cristina" };
		String archivoB = "c://prueba//Oficina B.txt";

		try (BufferedWriter escritorB = new BufferedWriter(new FileWriter(archivoB))) {

			for (String oficinaB : clientesB) {
				escritorB.write(oficinaB);
				escritorB.newLine();
			}

			System.out.println("Datos guardados en " + archivoB);

		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero Oficina B.txt");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero Oficina B.txt");
		}

		try {
			BufferedReader br1 = new BufferedReader(new FileReader("c://prueba//Oficina A.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("c://prueba//Oficina B.txt"));

			BufferedWriter bw = new BufferedWriter(new FileWriter("c://prueba//UnionClientes.txt"));

			String linea1 = "";
			String linea2 = "";

			while (linea1 != null || linea2 != null) {
				linea1 = br1.readLine();
				linea2 = br2.readLine();

				if (linea1 != null) {
					bw.write(linea1 + "\n");
				}

				if (linea2 != null) {
					bw.write(linea2 + "\n");
				}

			}

			System.out.println("Proceso realizado con éxito");

			br1.close();
			br2.close();
			bw.close();

		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentran los ficheros");
		} catch (IOException ioe) {
			System.out.println("No se puede leer los ficheros");
		}

	}

}

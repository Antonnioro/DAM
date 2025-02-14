package Tema1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio12_CambiarPalabras {

	public static void main(String[] args) {

		String rutaArchivo = "c://prueba//Ciudades.txt";

		String palabraBuscada = "Sevilla";

		String nuevaPalabra = "Málaga";

		File archivo = new File(rutaArchivo);
		File archivoTemporal = new File("temp.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(archivo));
				BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))) {

			String linea;

			while ((linea = br.readLine()) != null) {

				String nuevaLinea = linea.replaceAll(palabraBuscada, nuevaPalabra);
				bw.write(nuevaLinea);

				bw.newLine();

			}

		} catch (IOException e) {
			System.out.println("Error al leer/escribir el archivo: " + e.getMessage());
			return;
		}

		if (archivo.delete()) {
			if (!archivoTemporal.renameTo(archivo)) {
				System.out.println("Error al renombrar el archivo temporal.");
			} else {
				System.out.println("Palabra cambiada exitosamente.");
			}
		} else {
			System.out.println("Error al eliminar el archivo original.");
		}

	}

}

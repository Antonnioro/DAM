package Tema1;

import java.io.File;
import java.io.IOException;

public class Ejercicio3_CrearFichero {

	public static void main(String[] args) {

		String ruta = "c:\\prueba\\ejercicio1\\";
		String nombreFichero = "Cordoba.txt";
		File fichero = new File(ruta + nombreFichero);

		try {

			if (fichero.createNewFile()) {
				System.out.println("Fichero creado: " + fichero.getName());
			} else {
				System.out.println("El fichero ya existe");
			}

		} catch (IOException e) {
			System.out.println("Ocurrió un error al crear el fichero");
			e.printStackTrace();
		}

	}

}

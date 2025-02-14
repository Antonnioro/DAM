package Tema1;

import java.io.File;
import java.io.IOException;

public class Ejercicio3_Variacion {

	public static void main(String[] args) {

		// Crear carpeta ejercicio

		String ruta = "C:\\prueba\\";
		String carpeta = "ejercicio2";
		File fichero = new File(ruta + carpeta);
		fichero.mkdir();
		System.out.println("Carpeta creada");

		// Ver Propiedades

		System.out.println("Información sobre el directorio");
		File direc = new File("c:\\prueba\\ejercicio2\\");
		if (direc.exists()) {
			System.out.println("Nombre del directorio : " + direc.getName());
			System.out.println("Ruta : " + direc.getPath());
			System.out.println("Ruta absoluta : " + direc.getAbsolutePath());
			System.out.println("Lectura : " + direc.canRead());
			System.out.println("Escritura : " + direc.canWrite());
			System.out.println("Tamaño : " + direc.length() + " Kb");
			System.out.println("Directorio : " + direc.isDirectory());
			System.out.println("Fichero : " + direc.isFile());
			System.out.println("Nombre del directorio padre : " + direc.getParent());
		} else {
			System.out.println("No existe nada de nada.");
		}

		// Crear el archivo txt

		String ruta2 = "c:\\prueba\\ejercicio2\\";
		String nombreFichero = "sevilla.txt";
		File fichero2 = new File(ruta2 + nombreFichero);

		try {

			if (fichero2.createNewFile()) {
				System.out.println("Fichero creado: " + fichero2.getName());
			} else {
				System.out.println("El fichero ya existe");
			}

		} catch (IOException e) {
			System.out.println("Ocurrió un error al crear el fichero");
			e.printStackTrace();
		}

	}

}

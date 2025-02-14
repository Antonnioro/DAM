package Tema1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioRepasoExamen {

	public static void main(String[] args) throws IOException {
 
		Scanner t = new Scanner(System.in);
		int opcion;

		do {

			System.out.println("Menú");
			System.out.println("1. Crear Carpeta");
			System.out.println("2. Crear Fichero");
			System.out.println("3. Escribir Fichero");
			System.out.println("4. Leer Fichero");
			System.out.println("5. Borrar Fichero");
			System.out.println("6. Borrar Carpeta");
			System.out.println("7. Salir");

			opcion = t.nextInt();
			t.nextLine(); // Es necesario para guardar el texto en el documento

			switch (opcion) {
			case 1:
				String ruta = "D:\\prueba\\";
				String carpeta = "Carpeta Examen";
				File fichero = new File(ruta + carpeta);
				fichero.mkdir();
				System.out.println("Carpeta creada");
				break;

			case 2:
				String rutaCarpeta = "D:\\prueba\\Carpeta Examen\\";
				String nombreArchivo = "Examen.txt";
				File archivo = new File(rutaCarpeta, nombreArchivo);
				new File(rutaCarpeta).mkdir();
				FileWriter miFichero = new FileWriter(archivo);
				/*
				 * String ruta = "D:\\prueba\\Carpeta Examen\\"; String nombreFichero =
				 * "sevilla.txt"; File fichero = new File(ruta + nombreFichero);
				 * 
				 * try {
				 * 
				 * if (fichero.createNewFile()) { System.out.println("Fichero creado: " +
				 * fichero.getName()); } else { System.out.println("El fichero ya existe"); }
				 * 
				 * } catch (IOException e) {
				 * System.out.println("Ocurrió un error al crear el fichero");
				 * e.printStackTrace(); }
				 */
				break;

			case 3:
				System.out.println("Escribe el texto que quieras que se guarde en el archivo");
				String texto = t.nextLine();
				FileWriter escribir = new FileWriter("D:\\prueba\\Carpeta Examen\\Examen.txt");
				escribir.write(texto);
				escribir.close();
				System.out.println("Texto guardado correctamente");
				break;

			case 4:
				BufferedReader br = new BufferedReader(new FileReader("D:\\prueba\\Carpeta Examen\\Examen.txt"));
				String linea = "";
				while ((linea = br.readLine()) != null) {
					System.out.println(linea);
				}
				br.close();
				break;

			case 5:
				String nombreDocumento = "D:\\prueba\\Carpeta Examen\\Examen.txt";
				File documento = new File(nombreDocumento);
				if (documento.exists()) {
					documento.delete();
					System.out.println("El documento ha sido borrado correctamente");
				} else {
					System.out.println("El documento " + nombreDocumento + " no existe.");
				}
				break;

			case 6:
				String nombreCarpeta = "D:\\prueba\\Carpeta Examen";
				File carpetas = new File(nombreCarpeta);
				if (carpetas.exists()) {
					carpetas.delete();
					System.out.println("La carpeta ha sido borrada correctamente");
				} else {
					System.out.println("La carpeta " + nombreCarpeta + " no existe.");
				}
				break;

			case 7:
				System.out.println("Has elegido salir.");
				break;

			default:
				System.out.println("Opción inválida. Intente de nuevo.");
			}
		} while (opcion != 7);
		t.close();
	}
}

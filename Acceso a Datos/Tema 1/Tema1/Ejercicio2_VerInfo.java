package Tema1;

import java.io.*; //No es recomendable el uso del * debido a que importa muchas cosas

public class Ejercicio2_VerInfo {

	public static void main(String[] args) {

		System.out.println("Información sobr el directorio");
		File direc = new File("c:\\prueba\\ejercicio1\\");
		if (direc.exists()) {
			System.out.println("Nombre del directorio : " + direc.getName());
			System.out.println("Ruta : " + direc.getPath());
			System.out.println("Ruta absoluta : " + direc.getAbsolutePath());
			System.out.println("Lectura : " + direc.canRead());
			System.out.println("Escritura : " + direc.canWrite());
			System.out.println("Tamaño : " + direc.length() + " Kb"); // El tamaño es expresado en bytes
			System.out.println("Directorio : " + direc.isDirectory());
			System.out.println("Fichero : " + direc.isFile());
			System.out.println("Nombre del directorio padre : " + direc.getParent());
		} else {
			System.out.println("No existe nada de nada.");
		}

	}

}

package Tema1;

import java.io.File;

public class Ejercicio4_BorrarFichero {

	public static void main(String[] args) {

		String nombreFichero = "c:\\prueba\\ejercicio1";
		File fichero = new File(nombreFichero);
		if (fichero.exists()) { 										//Comprueba si existe.
			fichero.delete(); 											//Lo borra
			System.out.println("El fichero se ha borrado correctamente.");
		} else {
			System.out.println("El fichero " + nombreFichero + " no existe.");
		}

	}

}

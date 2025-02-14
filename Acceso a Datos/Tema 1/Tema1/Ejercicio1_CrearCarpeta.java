package Tema1;

import java.io.File;

public class Ejercicio1_CrearCarpeta {

	public static void main(String[] args) {
		String ruta = "C:\\prueba\\"; // Hay que crear la carpeta prueba manualmente
		String carpeta = "ejercicio1";
		File fichero = new File(ruta + carpeta);
		fichero.mkdir();
		System.out.println("Carpeta creada");

	}

}

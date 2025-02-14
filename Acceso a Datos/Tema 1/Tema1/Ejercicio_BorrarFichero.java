package Tema1;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Ejercicio_BorrarFichero {

	public static void main(String[] args) throws IOException {

		File carpeta = new File("c:\\prueba\\ejercicio1");

		if (carpeta.exists() && carpeta.isDirectory()) {
			System.out.println("El directorio existe");
			FileUtils.deleteDirectory(carpeta);
			System.out.println("El directorio ha sido borrado");
		} else {
			System.out.println("El directorio no existe o no es un directorio válido");
		}

	}

}

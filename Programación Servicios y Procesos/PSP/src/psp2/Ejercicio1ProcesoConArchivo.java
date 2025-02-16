package psp2;

import java.io.IOException;
import java.io.File;

public class Ejercicio1ProcesoConArchivo {

	public static void main(String[] args) throws IOException, InterruptedException {

		ProcessBuilder proceso;
		System.out.println("Abriendo el Bloc de Notas");
		proceso = new ProcessBuilder("C:/Windows/notepad.exe", "pelis.txt");
		proceso.directory(new File("c:/prueba"));
		Process p = proceso.start();
		p.waitFor(); //se pone en modo espera
		System.out.println("El Bloc de notas se ha detenido");

	}

}
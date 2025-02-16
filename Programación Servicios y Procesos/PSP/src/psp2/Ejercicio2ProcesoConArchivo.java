package psp2;

import java.io.File;
import java.io.IOException;

public class Ejercicio2ProcesoConArchivo {

	public static void main(String[] args) throws IOException, InterruptedException {

		ProcessBuilder proceso;
		System.out.println("Abriendo el Word");
		proceso = new ProcessBuilder("C:/Program Files/Microsoft Office/root/Office16/WINWORD.exe", "EjercicioWord.docx");
		proceso.directory(new File("c:/prueba"));
		Process p = proceso.start();

	}

}

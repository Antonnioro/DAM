package psp;

import java.io.IOException;

public class Ejercicio3Proceso {

	public static void main(String[] args) throws IOException, InterruptedException {
		ProcessBuilder proceso;
		System.out.println("Abriendo el Word");
		proceso = new ProcessBuilder("C:/Program Files/Microsoft Office/root/Office16/WINWORD.exe");
		proceso.start();

	}

}

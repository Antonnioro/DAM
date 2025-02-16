package psp;

import java.io.IOException;

public class Ejercicio2Proceso {

	public static void main(String[] args) throws InterruptedException, IOException {
		ProcessBuilder proceso;
		System.out.println("Abriendo el Bloc de Notas");
		proceso = new ProcessBuilder("C:/Windows/notepad.exe");
		Process p = proceso.start();
		Thread.sleep(5000);
		p.destroy(); // cerrar
		System.out.println("El Bloc de notas se ha cerrado");

	}

}
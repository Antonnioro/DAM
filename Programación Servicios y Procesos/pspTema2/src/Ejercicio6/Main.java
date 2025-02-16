package Ejercicio6;

public class Main {

	public static void main(String[] args) {

		Thread archivoGrande = new HiloDescarga("ArchivoGrande", 100, Thread.MAX_PRIORITY);
		Thread archivoMediano = new HiloDescarga("ArchivoMediano", 50, Thread.NORM_PRIORITY);
		Thread archivoPequeño = new HiloDescarga("ArchivoPequeño", 10, Thread.MIN_PRIORITY);

		archivoGrande.start();
		archivoMediano.start();
		archivoPequeño.start();
	}
}

class HiloDescarga extends Thread {
	private String nombreArchivo;
	private int tamañoMB;

	public HiloDescarga(String nombreArchivo, int tamañoMB, int prioridad) {
		this.nombreArchivo = nombreArchivo;
		this.tamañoMB = tamañoMB;
		this.setPriority(prioridad);
	}

	public void run() {
		System.out.println("Iniciando descarga de: " + nombreArchivo + " (Tamaño: " + tamañoMB + " MB), Prioridad: "
				+ getPriority());

		try {
			Thread.sleep(tamañoMB * 20);
		} catch (InterruptedException e) {
			System.out.println("Descarga interrumpida: " + nombreArchivo);
		}

		System.out.println("Descarga completada de: " + nombreArchivo + " (Prioridad: " + getPriority() + ")");
	}

}

package ejerciciosBasicos;

//Hora Servidor

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;

public class Ejercicio5HoraActualServidor {

	public static void main(String[] args) {

		try {
			ServerSocket servidor = new ServerSocket(12345);
			System.out.println("Servidor iniciado y escuchando en el puerto 12345...");

			Socket cliente = servidor.accept();
			System.out.println("Cliente conectado: " + cliente.getInetAddress());

			LocalTime horaActual = LocalTime.now();

			System.out.println("Hora actual generada: " + horaActual);

			OutputStream salida = cliente.getOutputStream();
			PrintWriter escritor = new PrintWriter(salida, true);
			escritor.println("¡Bienvenido al servidor!");

			escritor.close();
			cliente.close();
			servidor.close();
			System.out.println("Conexión cerrada.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

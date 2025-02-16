package ejercicio13ServidorConcurrenteIterativo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {

		try (ServerSocket servidor = new ServerSocket(6789)) {
			System.out.println("Servidor concurrente iniciado en el puerto 6789.");

			while (true) {
				System.out.println("Esperando cliente...");
				Socket cliente = servidor.accept();
				System.out.println("Cliente conectado desde: " + cliente.getInetAddress());
				new Thread(new HiloQueAtiende(cliente)).start();
			}
		} catch (Exception e) {
			System.out.println("Error en el servidor: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

class HiloQueAtiende implements Runnable {
	private Socket cliente;

	public HiloQueAtiende(Socket cliente) {
		this.cliente = cliente;
	}

	@Override
	public void run() {
		try (BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
				PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true)) {

			String mensaje;
			while ((mensaje = entrada.readLine()) != null) {
				if (mensaje.equalsIgnoreCase("FIN")) {
					System.out.println("Cliente finalizó la conexión.");
					break;
				}
				System.out.println("Mensaje recibido: " + mensaje);
				salida.println("Número de caracteres: " + mensaje.length());
			}
		} catch (Exception e) {
			System.out.println("Error manejando cliente: " + e.getMessage());
			e.printStackTrace();
		}

	}

}

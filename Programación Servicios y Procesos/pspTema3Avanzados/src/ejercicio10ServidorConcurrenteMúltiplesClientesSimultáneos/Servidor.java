package ejercicio10ServidorConcurrenteMúltiplesClientesSimultáneos;

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
				new Thread(new ManejadorCliente(cliente)).start();
			}
		} catch (Exception e) {
			System.out.println("Error en el servidor: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

class ManejadorCliente implements Runnable {
	private Socket cliente;

	public ManejadorCliente(Socket cliente) {
		this.cliente = cliente;
	}

	@Override
	public void run() {
		try (BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
				PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true)) {

			String mensajeCliente;
			while ((mensajeCliente = entrada.readLine()) != null) {
				if (mensajeCliente.equalsIgnoreCase("FIN")) {
					System.out.println("Cliente finalizó la conexión.");
					break;
				}
				System.out.println("Mensaje recibido: " + mensajeCliente);
				salida.println("Eco del servidor: " + mensajeCliente);
			}
		} catch (Exception e) {
			System.out.println("Error manejando cliente: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

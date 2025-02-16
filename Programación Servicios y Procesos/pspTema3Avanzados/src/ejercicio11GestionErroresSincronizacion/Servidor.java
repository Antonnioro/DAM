package ejercicio11GestionErroresSincronizacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

public class Servidor {
	private static AtomicInteger contadorClientes = new AtomicInteger(0);

	public static void main(String[] args) {
		try (ServerSocket servidor = new ServerSocket(6789)) {
			System.out.println("Servidor sincronizado iniciado en el puerto 6789");

			while (true) {
				Socket cliente = servidor.accept();
				int clienteId = contadorClientes.incrementAndGet();

				System.out.println("Cliente " + clienteId + " conectado desde: " + cliente.getInetAddress());

				new Thread(new ManejadorClienteSincronizado(cliente, clienteId)).start();
			}
		} catch (Exception e) {
			System.out.println("Error en el servidor: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

class ManejadorClienteSincronizado implements Runnable {
	private Socket cliente;
	private int clienteId;

	public ManejadorClienteSincronizado(Socket cliente, int clienteId) {
		this.cliente = cliente;
		this.clienteId = clienteId;
	}

	@Override
	public void run() {
		try (BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
				PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true)) {

			String mensajeCliente;
			while ((mensajeCliente = entrada.readLine()) != null) {
				if (mensajeCliente.equalsIgnoreCase("FIN")) {
					System.out.println("Cliente " + clienteId + " finalizó la conexión.");
					break;
				}
				synchronized (this) {
					System.out.println("Cliente " + clienteId + ": " + mensajeCliente);
				}
				salida.println("Eco del servidor para Cliente " + clienteId + ": " + mensajeCliente);
			}
		} catch (Exception e) {
			System.out.println("Error manejando cliente " + clienteId + ": " + e.getMessage());
			e.printStackTrace();
		}
	}

}
package ejercicio14MonitorizaciónTiemposRespuesta;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {

		try (ServerSocket servidor = new ServerSocket(6789)) {
			System.out.println("Servidor con monitorización iniciado en el puerto 6789.");

			while (true) {
				Socket cliente = servidor.accept();
				new Thread(new HiloMonitor(cliente)).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class HiloMonitor implements Runnable {
	private Socket cliente;

	public HiloMonitor(Socket cliente) {
		this.cliente = cliente;
	}

	@Override
	public void run() {
		try (BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
				PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true)) {

			String mensaje;
			while ((mensaje = entrada.readLine()) != null) {
				long inicio = System.currentTimeMillis();

				if (mensaje.equalsIgnoreCase("FIN")) {
					break;
				}

				long fin = System.currentTimeMillis();
				salida.println("Tiempo de respuesta: " + (fin - inicio) + " ms");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

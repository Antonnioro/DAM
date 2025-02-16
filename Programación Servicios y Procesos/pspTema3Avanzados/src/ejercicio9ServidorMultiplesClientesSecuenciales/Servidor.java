package ejercicio9ServidorMultiplesClientesSecuenciales;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {

		try (ServerSocket servidor = new ServerSocket(12345)) {
			System.out.println("Servidor iniciado en el puerto 12345.");

			String continuar = "S";
			while (continuar.equalsIgnoreCase("S")) {
				System.out.println("Esperando cliente...");
				Socket cliente = servidor.accept();
				System.out.println("Cliente conectado desde: " + cliente.getInetAddress());

				BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
				PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);

				String mensajeCliente;
				while ((mensajeCliente = entrada.readLine()) != null) {
					if (mensajeCliente.equalsIgnoreCase("FIN")) {
						System.out.println("Cliente finalizó la conexión.");
						break;
					}
					System.out.println("Mensaje recibido: " + mensajeCliente);
					salida.println("Eco del servidor: " + mensajeCliente);
				}

				entrada.close();
				salida.close();
				cliente.close();
				System.out.print("¿Deseas atender a un nuevo cliente? (S/N): ");
				continuar = new BufferedReader(new InputStreamReader(System.in)).readLine();
			}
			System.out.println("Servidor cerrado.");
		} catch (Exception e) {
			System.out.println("Error en el servidor: " + e.getMessage());
			e.printStackTrace();
		}

	}

}

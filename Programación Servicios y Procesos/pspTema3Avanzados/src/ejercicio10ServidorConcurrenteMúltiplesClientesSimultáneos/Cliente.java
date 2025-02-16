package ejercicio10ServidorConcurrenteMúltiplesClientesSimultáneos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {

		try (Socket cliente = new Socket("localhost", 6789)) {
			System.out.println("Conectado al servidor en el puerto 6789.");

			BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);
			Scanner scanner = new Scanner(System.in);

			String mensaje;
			do {
				System.out.print("Escribe un mensaje (escribe FIN para salir): ");
				mensaje = scanner.nextLine();
				salida.println(mensaje);
				if (!mensaje.equalsIgnoreCase("FIN")) {
					System.out.println("Respuesta del servidor: " + entrada.readLine());
				}
			} while (!mensaje.equalsIgnoreCase("FIN"));

			entrada.close();
			salida.close();
			scanner.close();
			System.out.println("Conexión cerrada.");
		} catch (Exception e) {
			System.out.println("Error en el cliente: " + e.getMessage());
			e.printStackTrace();
		}

	}

}

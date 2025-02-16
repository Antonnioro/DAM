package ejerciciosBasicos;

//Hora Cliente

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Ejercicio5HoraActualCliente {

	public static void main(String[] args) {

		try {
			Socket cliente = new Socket("localhost", 12345);
			System.out.println("Conectado al servidor.");

			BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			String mensaje = entrada.readLine();
			System.out.println("Mensaje del servidor: " + mensaje);

			entrada.close();
			cliente.close();
			System.out.println("Conexión cerrada.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

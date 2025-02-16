package ejerciciosBasicos;

//Mensaje Cliente

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Ejercicio6ComunicacionBidireccionalCliente {

	public static void main(String[] args) {

		try {
			Socket cliente = new Socket("localhost", 6789);
			System.out.println("Conectado al servidor en el puerto 6789 en verdad.");

			OutputStream salida = cliente.getOutputStream();
			PrintWriter escritor = new PrintWriter(salida, true);
			escritor.println("Hola, soy Anto.");

			BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			String mensajeServidor = entrada.readLine();
			System.out.println("Mensaje del servidor: " + mensajeServidor);

			entrada.close();
			escritor.close();
			cliente.close();

			System.out.println("Conexión cerrada.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

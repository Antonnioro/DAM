package ejerciciosBasicos;

//Mensaje Servidor

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ejercicio6ComunicacionBidireccionalServidor {

	public static void main(String[] args) {

		try {
			ServerSocket servidor = new ServerSocket(6789);
			System.out.println("Servidor iniciado en el puerto 6789, esperando clientes...");

			Socket cliente = servidor.accept();
			System.out.println("Cliente conectado desde: " + cliente.getInetAddress());

			BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			String mensajeCliente = entrada.readLine();
			System.out.println("Mensaje recibido del cliente: " + mensajeCliente);

			OutputStream salida = cliente.getOutputStream();
			PrintWriter escritor = new PrintWriter(salida, true);
			escritor.println("Mensaje recibido: " + mensajeCliente);

			escritor.close();
			entrada.close();
			cliente.close();
			servidor.close();

			System.out.println("Conexión cerrada.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

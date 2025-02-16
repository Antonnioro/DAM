package ejercicio12ServidorNoOrientadoConexionUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Emisor {
	public static void main(String[] args) {

		try {
			DatagramSocket socket = new DatagramSocket();
			InetAddress direccionServidor = InetAddress.getByName("localhost");

			Scanner scanner = new Scanner(System.in);
			String mensaje;

			do {
				System.out.print("Escribe un mensaje para enviar al servidor (escribe FIN para salir): ");
				mensaje = scanner.nextLine();
				byte[] buffer = mensaje.getBytes();

				DatagramPacket paquete = new DatagramPacket(buffer, buffer.length, direccionServidor, 9876);
				socket.send(paquete);

				byte[] bufferRespuesta = new byte[256];
				DatagramPacket paqueteRespuesta = new DatagramPacket(bufferRespuesta, bufferRespuesta.length);
				socket.receive(paqueteRespuesta);

				String respuesta = new String(paqueteRespuesta.getData(), 0, paqueteRespuesta.getLength());
				System.out.println("Respuesta del servidor: " + respuesta);

			} while (!mensaje.equalsIgnoreCase("FIN"));

			socket.close();
			scanner.close();
			System.out.println("Cliente UDP finalizado.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

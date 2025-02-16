package ejercicio12ServidorNoOrientadoConexionUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receptor {
	public static void main(String[] args) {

		try {
			DatagramSocket socket = new DatagramSocket(9876);
			System.out.println("Servidor UDP iniciado en el puerto 9876. Esperando mensajes...");

			byte[] buffer = new byte[256];

			while (true) {
				DatagramPacket paquete = new DatagramPacket(buffer, buffer.length);
				socket.receive(paquete);

				String mensaje = new String(paquete.getData(), 0, paquete.getLength());
				System.out.println("Mensaje recibido: " + mensaje);

				String respuesta = "Mensaje recibido correctamente";
				byte[] respuestaBytes = respuesta.getBytes();
				DatagramPacket paqueteRespuesta = new DatagramPacket(respuestaBytes, respuestaBytes.length,
						paquete.getAddress(), paquete.getPort());
				socket.send(paqueteRespuesta);

				if (mensaje.equalsIgnoreCase("FIN")) {
					System.out.println("Finalizando servidor UDP.");
					break;
				}
			}

			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

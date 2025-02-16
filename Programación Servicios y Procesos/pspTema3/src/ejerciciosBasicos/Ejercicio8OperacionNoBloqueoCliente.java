package ejerciciosBasicos;

//Operacion no bloqueante Cliente

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Ejercicio8OperacionNoBloqueoCliente {
	public static void main(String[] args) {

		try {

			SocketChannel cliente = SocketChannel.open(new InetSocketAddress("localhost", 6789));
			cliente.configureBlocking(true);

			String mensaje = "¡En verdad!";
			ByteBuffer buffer = ByteBuffer.wrap(mensaje.getBytes());
			cliente.write(buffer);
			System.out.println("Mensaje enviado al servidor.");

			buffer.clear();
			cliente.read(buffer);
			buffer.flip();
			System.out.println("Respuesta del servidor: " + new String(buffer.array(), 0, buffer.limit()));

			cliente.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
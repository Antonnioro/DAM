package ejerciciosBasicos;

//Operacion no bloqueante Servidor

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class Ejercicio8OperacionNoBloqueoServidor {
	public static void main(String[] args) {

		try {
			ServerSocketChannel servidor = ServerSocketChannel.open();
			servidor.bind(new InetSocketAddress(6789));
			servidor.configureBlocking(false);

			Selector selector = Selector.open();
			servidor.register(selector, servidor.validOps());

			System.out.println("Servidor iniciado. Esperando conexiones...");

			while (true) {
				selector.select();
				Iterator<java.nio.channels.SelectionKey> iterador = selector.selectedKeys().iterator();

				while (iterador.hasNext()) {
					var key = iterador.next();

					if (key.isAcceptable()) {
						SocketChannel cliente = servidor.accept();
						cliente.configureBlocking(false);
						cliente.register(selector, java.nio.channels.SelectionKey.OP_READ);
						System.out.println("Cliente conectado.");
					} else if (key.isReadable()) {
						SocketChannel cliente = (SocketChannel) key.channel();
						ByteBuffer buffer = ByteBuffer.allocate(256);
						int bytesLeidos = cliente.read(buffer);

						if (bytesLeidos > 0) {
							buffer.flip();
							String mensaje = new String(buffer.array(), 0, buffer.limit());
							System.out.println("Mensaje recibido: " + mensaje);

							cliente.write(ByteBuffer.wrap(("Eco: " + mensaje).getBytes()));
						} else {
							cliente.close();
							System.out.println("Cliente desconectado.");
						}
					}
					iterador.remove();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

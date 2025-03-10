package ejercicio11;

import javax.net.ssl.*;
import java.io.*;

public class ClienteSSL {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("javax.net.ssl.trustStore", "AlmacenSrv.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "1234567");

		SSLSocketFactory clientFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
		SSLSocket socket = (SSLSocket) clientFactory.createSocket("localhost", 9999);

		PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
		salida.println("¡Hola, servidor SSL!");

		salida.close();
		socket.close();
	}
}

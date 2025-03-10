package ejercicio11;

import javax.net.ssl.*;
import java.io.FileInputStream;
import java.security.KeyStore;

public class ServidorSSL {
	public static void main(String[] args) throws Exception {

		String keystoreFile = "AlmacenSrv.jks";
		char[] password = "1234567".toCharArray();

		KeyStore ks = KeyStore.getInstance("JKS");
		FileInputStream fis = new FileInputStream(keystoreFile);
		ks.load(fis, password);
		fis.close();

		KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
		kmf.init(ks, password);

		SSLContext sc = SSLContext.getInstance("TLSv1.2");
		sc.init(kmf.getKeyManagers(), null, null);

		SSLServerSocketFactory serverFactory = sc.getServerSocketFactory();
		SSLServerSocket servidor = (SSLServerSocket) serverFactory.createServerSocket(9999);

		System.out.println("✅ Servidor SSL esperando conexiones...");
		SSLSocket socket = (SSLSocket) servidor.accept();
		System.out.println("📩 Cliente conectado.");

		socket.close();
		servidor.close();
	}
}

package ejercicio7;

import javax.crypto.Cipher;
import java.io.*;
import java.security.*;

public class RSAFileKeyExample {
	public static void main(String[] args) throws Exception {

		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(2048);
		KeyPair keyPair = keyGen.generateKeyPair();

		guardarClave("public.key", keyPair.getPublic());
		guardarClave("private.key", keyPair.getPrivate());

		PublicKey publicKey = (PublicKey) cargarClave("public.key");
		PrivateKey privateKey = (PrivateKey) cargarClave("private.key");

		String mensaje = "Seguridad con claves en archivos";
		System.out.println("Texto original: " + mensaje);

		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		byte[] mensajeCifrado = cipher.doFinal(mensaje.getBytes());

		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		byte[] mensajeDescifrado = cipher.doFinal(mensajeCifrado);
		System.out.println("Texto descifrado: " + new String(mensajeDescifrado));
	}

	private static void guardarClave(String nombreArchivo, Key clave) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
			out.writeObject(clave);
		}
	}

	private static Key cargarClave(String nombreArchivo) throws IOException, ClassNotFoundException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
			return (Key) in.readObject();
		}
	}
}

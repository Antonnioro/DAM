package ejercicio12;

import java.security.*;

public class GenerarFirma {
	public static void main(String[] args) throws Exception {

		KeyPairGenerator generadorClaves = KeyPairGenerator.getInstance("RSA");
		generadorClaves.initialize(2048);
		KeyPair parClaves = generadorClaves.generateKeyPair();

		String mensaje = "Mensaje importante";

		Signature firma = Signature.getInstance("SHA256withRSA");
		firma.initSign(parClaves.getPrivate());
		firma.update(mensaje.getBytes());
		byte[] firmaGenerada = firma.sign();

		System.out.println("Firma digital generada: " + bytesAHex(firmaGenerada));
	}

	public static String bytesAHex(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {
			sb.append(String.format("%02x", b));
		}
		return sb.toString();
	}
}

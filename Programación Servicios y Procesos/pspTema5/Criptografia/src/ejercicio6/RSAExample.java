package ejercicio6;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;

public class RSAExample {
	public static void main(String[] args) throws Exception {

		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(2048);
		KeyPair keyPair = keyGen.generateKeyPair();
		PublicKey publicKey = keyPair.getPublic();
		PrivateKey privateKey = keyPair.getPrivate();

		String mensaje = "Hola, esto es ANDROID STUDIO!";
		System.out.println("Texto original: " + mensaje);

		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);

		byte[] mensajeCifrado = cipher.doFinal(mensaje.getBytes());
		String mensajeCifradoBase64 = Base64.getEncoder().encodeToString(mensajeCifrado);
		System.out.println("Texto cifrado: " + mensajeCifradoBase64);

		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		byte[] mensajeDescifrado = cipher.doFinal(Base64.getDecoder().decode(mensajeCifradoBase64));
		System.out.println("Texto descifrado: " + new String(mensajeDescifrado));

	}

}

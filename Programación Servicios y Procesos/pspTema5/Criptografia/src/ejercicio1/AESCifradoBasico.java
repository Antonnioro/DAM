package ejercicio1;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class AESCifradoBasico {
	public static void main(String[] args) throws Exception {

		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(128);
		SecretKey secretKey = keyGenerator.generateKey();

		Cipher cipher = Cipher.getInstance("AES");

		String mensaje = "Alberto the imperator!";
		System.out.println("Texto original: " + mensaje);

		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] mensajeCifrado = cipher.doFinal(mensaje.getBytes());
		String mensajeCifradoBase64 = Base64.getEncoder().encodeToString(mensajeCifrado);
		System.out.println("Texto cifrado: " + mensajeCifradoBase64);

		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] mensajeDescifrado = cipher.doFinal(Base64.getDecoder().decode(mensajeCifradoBase64));
		System.out.println("Texto descifrado: " + new String(mensajeDescifrado));

	}

}

package ejercicio2;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESClaveFija {
	public static void main(String[] args) throws Exception {
		String clave = "1234567890123456";
		SecretKeySpec secretKey = new SecretKeySpec(clave.getBytes(), "AES");

		Cipher cipher = Cipher.getInstance("AES");

		String mensaje = "Java es genial en verdad!";
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

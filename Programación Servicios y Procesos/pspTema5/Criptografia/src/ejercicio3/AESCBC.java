package ejercicio3;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class AESCBC {
	public static void main(String[] args) throws Exception {

		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(128);
		SecretKey secretKey = keyGenerator.generateKey();

		byte[] iv = new byte[16];
		IvParameterSpec ivSpec = new IvParameterSpec(iv);

		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

		String mensaje = "Cifrado con CBC!";
		System.out.println("Texto original: " + mensaje);

		cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivSpec);
		byte[] mensajeCifrado = cipher.doFinal(mensaje.getBytes());
		String mensajeCifradoBase64 = Base64.getEncoder().encodeToString(mensajeCifrado);
		System.out.println("Texto cifrado: " + mensajeCifradoBase64);

		cipher.init(Cipher.DECRYPT_MODE, secretKey, ivSpec);
		byte[] mensajeDescifrado = cipher.doFinal(Base64.getDecoder().decode(mensajeCifradoBase64));
		System.out.println("Texto descifrado: " + new String(mensajeDescifrado));

	}

}

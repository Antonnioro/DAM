package ejercicio4;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

public class AESGCM {
	public static void main(String[] args) throws Exception {

		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(128);
		SecretKey secretKey = keyGenerator.generateKey();

		Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");

		String mensaje = "Cifrado seguro!";
		System.out.println("Texto original: " + mensaje);
		
		byte[] iv = new byte[12];
		GCMParameterSpec gcmSpec = new GCMParameterSpec(128, iv);

		cipher.init(Cipher.ENCRYPT_MODE, secretKey, gcmSpec);
		byte[] mensajeCifrado = cipher.doFinal(mensaje.getBytes());
		String mensajeCifradoBase64 = Base64.getEncoder().encodeToString(mensajeCifrado);
		System.out.println("Texto cifrado: " + mensajeCifradoBase64);

		cipher.init(Cipher.DECRYPT_MODE, secretKey, gcmSpec);
		byte[] mensajeDescifrado = cipher.doFinal(Base64.getDecoder().decode(mensajeCifradoBase64));
		System.out.println("Texto descifrado: " + new String(mensajeDescifrado));

	}

}

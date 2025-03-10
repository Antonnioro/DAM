package ejercicio5;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AESCifradoArchivo {
	public static void main(String[] args) throws Exception {

		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(128);
		SecretKey secretKey = keyGenerator.generateKey();

		InputStream inputStream = AESCifradoArchivo.class.getResourceAsStream("mensaje.txt");

		if (inputStream == null) {
			throw new RuntimeException("No se encontró el archivo especificado");
		}

		byte[] contenido = inputStream.readAllBytes();

		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] archivoCifrado = cipher.doFinal(contenido);

		Path outputPath = Path.of(AESCifradoArchivo.class.getResource("mensaje.txt").toURI()).getParent()
				.resolve("mensaje_cifrado.txt");

		Files.write(outputPath, archivoCifrado);
		System.out.println("Archivo cifrado correctamente en " + outputPath);

	}

}

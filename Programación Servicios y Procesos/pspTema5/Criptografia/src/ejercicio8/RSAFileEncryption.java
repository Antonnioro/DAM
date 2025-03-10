package ejercicio8;

import javax.crypto.Cipher;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.security.*;

public class RSAFileEncryption {
	public static void main(String[] args) throws Exception {

		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(2048);
		KeyPair keyPair = keyGen.generateKeyPair();
		PublicKey publicKey = keyPair.getPublic();
		PrivateKey privateKey = keyPair.getPrivate();

		byte[] contenidoOriginal = leerArchivoDesdePaquete("mensaje.txt");

		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		byte[] contenidoCifrado = cipher.doFinal(contenidoOriginal);
		escribirArchivoEnPaquete("mensaje_cifrado.txt", contenidoCifrado);
		System.out.println("✅ Archivo cifrado correctamente!");

		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		byte[] contenidoDescifrado = cipher.doFinal(contenidoCifrado);
		escribirArchivoEnPaquete("mensaje_descifrado.txt", contenidoDescifrado);
		System.out.println("✅ Archivo descifrado correctamente!");
	}

	private static byte[] leerArchivoDesdePaquete(String nombreArchivo) throws IOException {
		InputStream inputStream = RSAFileEncryption.class.getResourceAsStream(nombreArchivo);
		if (inputStream == null) {
			throw new IOException("⚠️ No se encontró el archivo " + nombreArchivo + " dentro del paquete ejercicio8");
		}
		return inputStream.readAllBytes();
	}

	private static void escribirArchivoEnPaquete(String nombreArchivo, byte[] contenido)
			throws IOException, URISyntaxException {

		File carpetaPaquete = new File(
				RSAFileEncryption.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile();
		File archivoSalida = new File(carpetaPaquete, "ejercicio8/" + nombreArchivo);

		archivoSalida.getParentFile().mkdirs();

		Files.write(archivoSalida.toPath(), contenido);
		System.out.println("✅ Archivo guardado en: " + archivoSalida.getAbsolutePath());
	}
}

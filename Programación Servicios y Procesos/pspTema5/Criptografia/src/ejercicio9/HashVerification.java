package ejercicio9;

import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HashVerification {
	public static void main(String[] args) {

		String hashAlmacenado = leerHashDesdeArchivo();

		if (hashAlmacenado == null) {
			System.out.println("No se encontró el archivo hash.txt");
			return;
		}

		Scanner t = new Scanner(System.in);
		System.out.println("Introduce la contraseña: ");
		String input = t.nextLine();
		t.close();

		String hashInput = generarHashSHA256(input);

		if (hashInput.equals(hashAlmacenado)) {
			System.out.println("Contraseña correcta.");
		} else {
			System.out.println("Contraseña incorrecta");
		}

	}

	public static String generarHashSHA256(String input) {
		try {

			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hashBytes = digest.digest(input.getBytes());

			StringBuilder hexString = new StringBuilder();

			for (byte b : hashBytes) {
				hexString.append(String.format("%02x", b));
			}

			return hexString.toString();

		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Error al generar el hash", e);
		}
	}

	private static String leerHashDesdeArchivo() {
		try {
			File file = new File("hash.txt");
			Scanner t = new Scanner(file);
			String hash = t.nextLine();
			t.close();
			return hash;
		} catch (IOException e) {
			return null;
		}
	}

}

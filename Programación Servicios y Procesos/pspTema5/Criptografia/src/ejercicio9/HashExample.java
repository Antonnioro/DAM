package ejercicio9;

import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HashExample {
	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		System.out.println("Introduce una contaseña para hashear: ");
		String input = t.nextLine();
		t.close();

		String hash = generarHashSHA256(input);
		System.out.println("Hash generado (SHA-256): " + hash);

		try (FileWriter writer = new FileWriter("hash.txt")) {

			writer.write(hash);
			System.out.println("Hash guardado en hash.txt");

		} catch (IOException e) {
			System.out.println("Error al guardar el hash: " + e.getMessage());
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

}

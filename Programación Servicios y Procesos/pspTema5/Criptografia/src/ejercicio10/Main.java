package ejercicio10;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NoSuchAlgorithmException {

		Scanner lector = new Scanner(System.in);
		String passwordAplicacion = "ContrasenaSegura123";

		String hashAplicacion = generarHash(passwordAplicacion);

		System.out.println("Introduce tu password: ");
		String passwordUsuario = lector.nextLine();

		String hashUsuario = generarHash(passwordUsuario);

		if (hashAplicacion.equals(hashUsuario)) {
			System.out.println("Bienvenido al sistema");
		} else {
			System.out.println("Acceso denegado");
		}
		lector.close();
	}

	public static String generarHash(String password) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] hashBytes = md.digest(password.getBytes());

		StringBuilder hexString = new StringBuilder();
		for (byte b : hashBytes) {
			hexString.append(String.format("%02x", b));
		}
		return hexString.toString();
	}
}

package Tema1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejercicio13_CrearLeerBinario {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String usuario, clave;

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c://prueba//config.txt"))) {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Mete el nombre de usuario: ");
			usuario = br.readLine();

			System.out.println("Mete la clave: ");
			clave = br.readLine();

			oos.writeObject(usuario);
			oos.writeObject(clave);

		} catch (IOException e) {
			System.err.println("Error al escribir en el archivo: " + e.getMessage());
			return;
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c://prueba//config.txt"))) {
			usuario = (String) ois.readObject();
			clave = (String) ois.readObject();
		} catch (IOException e) {
			System.err.println("Error al leer del archivo: " + e.getMessage());
			return;
		}

		System.out.println("Nombre de usuario: " + usuario);
		System.out.println("Clave: " + clave);

	}

}

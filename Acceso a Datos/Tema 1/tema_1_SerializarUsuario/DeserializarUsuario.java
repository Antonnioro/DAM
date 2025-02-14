package tema_1_SerializarUsuario;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializarUsuario {

	public static void main(String[] args) {

		try {
			FileInputStream fileIn = new FileInputStream("ficheros/usuario.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Usuario usuario = (Usuario) in.readObject();
			System.out.println("Objeto deserializado: " + usuario);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

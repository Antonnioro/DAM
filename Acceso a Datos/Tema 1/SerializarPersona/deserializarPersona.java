package SerializarPersona;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializarPersona {

	public static void main(String[] args) {

		try {
			FileInputStream fileIn = new FileInputStream("ficheros/persona.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Persona persona = (Persona) in.readObject();
			System.out.println("Objeto deserializado: " + persona);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

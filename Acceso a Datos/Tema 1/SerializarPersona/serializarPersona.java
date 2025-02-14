package SerializarPersona;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarPersona {

	public static void main(String[] args) {

		Persona persona = new Persona("Alberto Ruiz", 40);

		try {
			FileOutputStream fileOut = new FileOutputStream("ficheros/persona.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(persona);
			System.out.println("Objeto serializado y guardado");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

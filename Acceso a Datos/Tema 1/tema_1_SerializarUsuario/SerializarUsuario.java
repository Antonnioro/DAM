package tema_1_SerializarUsuario;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarUsuario {

	public static void main(String[] args) {

		Usuario usuario = new Usuario("Antonio", "Rodríguez", "Arodbar", "arobar171.cenec@gmail.com", "1a2b3c");

		try {

			FileOutputStream fileOut = new FileOutputStream("ficheros/usuario.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(usuario);
			System.out.println("Producto serializado y guardado");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

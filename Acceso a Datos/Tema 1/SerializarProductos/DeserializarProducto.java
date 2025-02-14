package SerializarProductos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializarProducto {

	public static void main(String[] args) {

		try {
			FileInputStream fileIn = new FileInputStream("ficheros/producto.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Productos producto = (Productos) in.readObject();
			System.out.println("Objeto deserializado: " + producto);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

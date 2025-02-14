package SerializarProductos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarProducto {

	public static void main(String[] args) {

		Productos producto = new Productos(1, "Impresora", 69.99);

		try {

			FileOutputStream fileOut = new FileOutputStream("ficheros/producto.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(producto);
			System.out.println("Producto serializado y guardado");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

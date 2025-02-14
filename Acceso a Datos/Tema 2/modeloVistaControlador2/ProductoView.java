package modeloVistaControlador2;

import java.util.List;

public class ProductoView {
	public void mostrarProductos(List<Producto> productos) {
		for (Producto producto : productos) {
			System.out.println("ID: " + producto.getId());
			System.out.println("Codigo: " + producto.getCodigo());
			System.out.println("Nombre: " + producto.getNombre());
			System.out.println("Precio: " + producto.getPrecio());
			System.out.println();
		}
	}

}

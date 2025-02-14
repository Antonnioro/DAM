package modeloVistaControlador1;

import java.util.List;

public class ClienteView {
	public void mostrarClientes(List<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			System.out.println("ID: " + cliente.getId());
			System.out.println("NIF: " + cliente.getNif());
			System.out.println("Nombre: " + cliente.getNif());
			System.out.println("Edad: " + cliente.getEdad());
			System.out.println(); // Linea en blanco

		}
	}

}

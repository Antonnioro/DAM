package ejercicio1;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClienteRMI {
	public static void main(String[] args) {
		try {
			Registry registro = LocateRegistry.getRegistry("localhost", 1099);

			MiInterfazRemota stub = (MiInterfazRemota) registro.lookup("ServidorRMI");

			String respuesta = stub.saludar("Antonio");
			System.out.println("Respuesta del servidor: " + respuesta);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

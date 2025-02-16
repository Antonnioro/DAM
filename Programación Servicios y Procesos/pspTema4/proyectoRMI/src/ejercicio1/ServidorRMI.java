package ejercicio1;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorRMI extends UnicastRemoteObject implements MiInterfazRemota {

	protected ServidorRMI() throws RemoteException {
		super();
	}

	@Override
	public String saludar(String nombre) throws RemoteException {
		return "Hola, " + nombre + "! Bienvenido al servidor RMI.";
	}

	public static void main(String[] args) {
		try {
			ServidorRMI servidor = new ServidorRMI();

			Registry registro = LocateRegistry.createRegistry(1099);

			registro.rebind("ServidorRMI", servidor);

			System.out.println("Servidor RMI iniciado...");

		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

}

package ejercicio3;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorCalculadoraIVA extends UnicastRemoteObject implements CalculadoraIVARemota {

	protected ServidorCalculadoraIVA() throws RemoteException {
		super();
	}

	@Override
	public double iva7(double a) throws RemoteException {
		return a * 1.07;
	}

	@Override
	public double iva10(double a) throws RemoteException {
		return a * 1.10;
	}

	@Override
	public double iva21(double a) throws RemoteException {
		return a * 1.21;
	}

	public static void main(String[] args) {
		try {
			ServidorCalculadoraIVA servidor = new ServidorCalculadoraIVA();

			Registry registro = LocateRegistry.createRegistry(1099);

			registro.rebind("CalculadoraRemota", servidor);

			System.out.println("Servidor de Calculadora RMI iniciado...");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}

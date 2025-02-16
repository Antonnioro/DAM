package ejercicio5Reto;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorCalculadoraReto extends UnicastRemoteObject implements CalculadoraRetoRemota {

	protected ServidorCalculadoraReto() throws RemoteException {
		super();
	}

	@Override
	public double calculo(double a, double b) throws RemoteException {
		return Math.sqrt((a * a) + (b * b));
	}

	public static void main(String[] args) {
		try {
			ServidorCalculadoraReto servidor = new ServidorCalculadoraReto();

			Registry registro = LocateRegistry.createRegistry(1099);

			registro.rebind("CalculadoraRemota", servidor);

			System.out.println("Servidor de Calculadora RMI iniciado...");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}

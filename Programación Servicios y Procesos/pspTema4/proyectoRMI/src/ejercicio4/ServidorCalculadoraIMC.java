package ejercicio4;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorCalculadoraIMC extends UnicastRemoteObject implements CalculadoraIMCRemota {

	protected ServidorCalculadoraIMC() throws RemoteException {
		super();
	}

	@Override
	public double calculo(double a, double b) throws RemoteException {
		return (a / (b * b));
	}

	public static void main(String[] args) {
		try {
			ServidorCalculadoraIMC servidor = new ServidorCalculadoraIMC();

			Registry registro = LocateRegistry.createRegistry(1099);

			registro.rebind("CalculadoraRemota", servidor);

			System.out.println("Servidor de Calculadora RMI iniciado...");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}

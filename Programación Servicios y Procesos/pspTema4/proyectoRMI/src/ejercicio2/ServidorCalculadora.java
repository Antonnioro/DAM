package ejercicio2;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorCalculadora extends UnicastRemoteObject implements CalculadoraRemota {

	protected ServidorCalculadora() throws RemoteException {
		super();
	}

	@Override
	public double sumar(double a, double b) throws RemoteException {
		return a + b;
	}

	@Override
	public double restar(double a, double b) throws RemoteException {
		return a - b;
	}

	@Override
	public double multiplicar(double a, double b) throws RemoteException {
		return a * b;
	}

	@Override
	public double dividir(double a, double b) throws RemoteException {
		if (b == 0)
			throw new RemoteException("No se puede dividir por cero");
		return a / b;
	}

	public static void main(String[] args) {
		try {
			ServidorCalculadora servidor = new ServidorCalculadora();

			Registry registro = LocateRegistry.createRegistry(1099);

			registro.rebind("CalculadoraRemota", servidor);

			System.out.println("Servidor de Calculadora RMI iniciado...");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}

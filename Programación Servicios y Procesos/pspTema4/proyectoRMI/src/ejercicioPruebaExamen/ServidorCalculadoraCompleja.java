package ejercicioPruebaExamen;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorCalculadoraCompleja extends UnicastRemoteObject implements CalculadoraComplejaRemota {

	protected ServidorCalculadoraCompleja() throws RemoteException {
		super();
	}

	@Override
	public double suma(double a, double b) throws RemoteException {
		return a + b;
	}

	@Override
	public double resta(double a, double b) throws RemoteException {
		return a - b;
	}

	@Override
	public double multiplicacion(double a, double b) throws RemoteException {
		return a * b;
	}

	@Override
	public double division(double a, double b) throws RemoteException {
		return a / b;
	}

	@Override
	public double potencia(double a, double b) throws RemoteException {
		return Math.pow(a, b);
	}

	@Override
	public double raiz(double a) throws RemoteException {
		return Math.sqrt(a);
	}

	@Override
	public double pitagoras(double a, double b) throws RemoteException {
		return Math.sqrt((a * a) + (b * b));
	}

	public static void main(String[] args) {
		try {
			ServidorCalculadoraCompleja servidor = new ServidorCalculadoraCompleja();

			Registry registro = LocateRegistry.createRegistry(1099);

			registro.rebind("CalculadoraRemota", servidor);

			System.out.println("Servidor de Calculadora RMI iniciado...");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}

package ejercicio2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculadoraRemota extends Remote {
	double sumar(double a, double b) throws RemoteException;

	double restar(double a, double b) throws RemoteException;

	double multiplicar(double a, double b) throws RemoteException;

	double dividir(double a, double b) throws RemoteException;
}

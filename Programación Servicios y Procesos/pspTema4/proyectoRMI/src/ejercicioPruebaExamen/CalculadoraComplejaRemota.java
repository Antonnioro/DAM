package ejercicioPruebaExamen;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculadoraComplejaRemota extends Remote {
	double suma (double a, double b) throws RemoteException;

	double resta (double a, double b) throws RemoteException;

	double multiplicacion (double a, double b) throws RemoteException;
	
	double division (double a, double b) throws RemoteException;
	
	double potencia (double a, double b) throws RemoteException;
	
	double raiz (double a) throws RemoteException;
	
	double pitagoras (double a, double b) throws RemoteException;
}

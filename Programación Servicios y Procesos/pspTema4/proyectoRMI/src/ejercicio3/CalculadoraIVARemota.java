package ejercicio3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculadoraIVARemota extends Remote {
	double iva7(double a) throws RemoteException;

	double iva10(double a) throws RemoteException;

	double iva21(double a) throws RemoteException;
}

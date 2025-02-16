package ejercicio5Reto;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculadoraRetoRemota extends Remote {
	double calculo(double a, double b) throws RemoteException;
}

package ejercicio4;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculadoraIMCRemota extends Remote {
	double calculo(double a, double b) throws RemoteException;
}

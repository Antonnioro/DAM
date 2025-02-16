package ejercicio1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MiInterfazRemota extends Remote{
	String saludar(String nombre) throws RemoteException;
}

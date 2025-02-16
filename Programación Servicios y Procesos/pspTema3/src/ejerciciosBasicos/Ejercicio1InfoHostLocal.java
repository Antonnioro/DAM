package ejerciciosBasicos;

//Nombre del Host IP

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ejercicio1InfoHostLocal {
	public static void main(String[] args) throws UnknownHostException {

		InetAddress address = InetAddress.getLocalHost();
		System.out.println("Host Name: " + address.getHostName());
		System.out.println("Host Address: " + address.getHostAddress());
	}
}
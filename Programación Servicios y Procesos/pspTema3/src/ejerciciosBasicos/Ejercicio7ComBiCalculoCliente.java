package ejerciciosBasicos;

//Calculo Cliente

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Ejercicio7ComBiCalculoCliente {
	public static void main(String[] args) {

		int numero1 = 5;
		int numero2 = 3;
		double resultado = numero1 + numero2;

		try {
			Socket cliente = new Socket("localhost", 6789);
			System.out.println("Conectado al servidor en el puerto 6789.");

			OutputStream salida = cliente.getOutputStream();
			PrintWriter escritor = new PrintWriter(salida, true);
			escritor.println(numero1 + " + " + numero2);

			PrintWriter escritor2 = new PrintWriter(salida, true);
			escritor2.println(resultado);

			BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			String mensajeServidor = entrada.readLine();
			System.out.println("Mensaje del servidor: " + mensajeServidor);

			entrada.close();
			escritor.close();
			cliente.close();

			System.out.println("Conexión cerrada.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
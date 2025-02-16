package ejercicio5Reto;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClienteCalculadoraReto {
	public static void main(String[] args) {
		try {
			Registry registro = LocateRegistry.getRegistry("localhost", 1099);

			CalculadoraRetoRemota stub = (CalculadoraRetoRemota) registro.lookup("CalculadoraRemota");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Bienvenido a la Calculadora Pitágoras");
			System.out.print("Mete el valor del lado a: ");
			double num1 = scanner.nextDouble();

			System.out.print("Mete el valor del lado b: ");
			double num2 = scanner.nextDouble();

			double resultado = 0;

			resultado = stub.calculo(num1, num2);

			System.out.println("El lado C mide: " + resultado);

			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

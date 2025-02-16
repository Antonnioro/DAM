package ejercicio2;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClienteCalculadora {
	public static void main(String[] args) {
		try {
			Registry registro = LocateRegistry.getRegistry("localhost", 1099);

			CalculadoraRemota stub = (CalculadoraRemota) registro.lookup("CalculadoraRemota");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Bienvenido a la Calculadora RMI");
			System.out.print("Ingrese el primer número: ");
			double num1 = scanner.nextDouble();

			System.out.print("Ingrese el segundo número: ");
			double num2 = scanner.nextDouble();

			System.out.println("Seleccione operación:");
			System.out.println("1 - Sumar");
			System.out.println("2 - Restar");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");

			int opcion = scanner.nextInt();
			double resultado = 0;

			switch (opcion) {
			case 1:
				resultado = stub.sumar(num1, num2);
				System.out.println("Resultado: " + resultado);
				break;
			case 2:
				resultado = stub.restar(num1, num2);
				System.out.println("Resultado: " + resultado);
				break;
			case 3:
				resultado = stub.multiplicar(num1, num2);
				System.out.println("Resultado: " + resultado);
				break;
			case 4:
				try {
					resultado = stub.dividir(num1, num2);
					System.out.println("Resultado: " + resultado);
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;
			default:
				System.out.println("Opción no válida.");
			}

			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

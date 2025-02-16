package ejercicio3;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClienteCalculadoraIVA {
	public static void main(String[] args) {
		try {
			Registry registro = LocateRegistry.getRegistry("localhost", 1099);

			CalculadoraIVARemota stub = (CalculadoraIVARemota) registro.lookup("CalculadoraRemota");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Bienvenido a la Calculadora RMI");
			System.out.print("Ingrese un número: ");
			double num1 = scanner.nextDouble();

			System.out.println("Seleccione IVA:");
			System.out.println("1 - Iva 7%");
			System.out.println("2 - Iva 10%");
			System.out.println("3 - Iva 21%");

			int opcion = scanner.nextInt();
			double resultado = 0;

			switch (opcion) {
			case 1:
				resultado = stub.iva7(num1);
				System.out.println("Resultado: " + resultado);
				break;
			case 2:
				resultado = stub.iva10(num1);
				System.out.println("Resultado: " + resultado);
				break;
			case 3:
				resultado = stub.iva21(num1);
				System.out.println("Resultado: " + resultado);
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

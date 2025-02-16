package ejercicioPruebaExamen;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClienteCalculadoraCompleja {
	public static void main(String[] args) {
		try {
			Registry registro = LocateRegistry.getRegistry("localhost", 1099);

			CalculadoraComplejaRemota stub = (CalculadoraComplejaRemota) registro.lookup("CalculadoraRemota");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Bienvenido a la Calculadora RMI");

			System.out.println("Seleccione la operación que desea hacer:");
			System.out.println("1 - Suma");
			System.out.println("2 - Resta");
			System.out.println("3 - Multiplicación");
			System.out.println("4 - División");
			System.out.println("5 - Potencia");
			System.out.println("6 - Raiz");
			System.out.println("7 - Pitágoras");

			int opcion = scanner.nextInt();
			double resultado = 0;

			switch (opcion) {
			
			case 1:
				System.out.print("Ingrese el primer número: ");
				double suma1 = scanner.nextDouble();
				
				System.out.print("Ingrese el segudno número: ");
				double suma2 = scanner.nextDouble();
				
				resultado = stub.suma(suma1, suma2);
				System.out.println("Resultado: " + resultado);
				break;
				
			case 2:
				System.out.print("Ingrese el primer número: ");
				double resta1 = scanner.nextDouble();
				
				System.out.print("Ingrese el segudno número: ");
				double resta2 = scanner.nextDouble();
				
				resultado = stub.resta(resta1, resta2);
				System.out.println("Resultado: " + resultado);
				break;
				
			case 3:
				System.out.print("Ingrese el primer número: ");
				double producto1 = scanner.nextDouble();
				
				System.out.print("Ingrese el segudno número: ");
				double producto2 = scanner.nextDouble();
				
				resultado = stub.multiplicacion(producto1, producto2);
				System.out.println("Resultado: " + resultado);
				break;
				
			case 4:
				System.out.print("Ingrese el primer número: ");
				double divisor1 = scanner.nextDouble();
				
				System.out.print("Ingrese el segudno número: ");
				double divisor2 = scanner.nextDouble();
				
				resultado = stub.division(divisor1, divisor2);
				System.out.println("Resultado: " + resultado);
				break;
				
			case 5:
				System.out.print("Ingrese el número base: ");
				double base = scanner.nextDouble();
				
				System.out.print("Ingrese el cociente: ");
				double cociente = scanner.nextDouble();
				
				resultado = stub.potencia(base, cociente);
				System.out.println("Resultado: " + resultado);
				break;
				
			case 6:
				System.out.print("Ingrese el número base: ");
				double raiz = scanner.nextDouble();
				
				resultado = stub.raiz(raiz);
				System.out.println("Resultado: " + resultado);
				break;
				
			case 7:
				System.out.print("Ingrese el cateto 1: ");
				double cateto1 = scanner.nextDouble();
				
				System.out.print("Ingrese el cateto 2: ");
				double cateto2 = scanner.nextDouble();
				
				resultado = stub.pitagoras(cateto1, cateto2);
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

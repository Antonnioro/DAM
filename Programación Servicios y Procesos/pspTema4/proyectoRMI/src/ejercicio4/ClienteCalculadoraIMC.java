package ejercicio4;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClienteCalculadoraIMC {
	public static void main(String[] args) {
		try {
			Registry registro = LocateRegistry.getRegistry("localhost", 1099);

			CalculadoraIMCRemota stub = (CalculadoraIMCRemota) registro.lookup("CalculadoraRemota");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Bienvenido a la Calculadora RMI");
			System.out.print("Mete tu peso en kg: ");
			double num1 = scanner.nextDouble();

			System.out.print("Mete tu altura en metros: ");
			double num2 = scanner.nextDouble();

			double resultado = 0;

			resultado = stub.calculo(num1, num2);

			if (resultado < 16) {
				System.out.println("Resultado: " + resultado);
				System.out.println("Delgadez severa");

			} else if (resultado >= 16 && resultado <= 16.99) {
				System.out.println("Resultado: " + resultado);
				System.out.println("Delgadez moderada");

			} else if (resultado >= 17 && resultado <= 18.49) {
				System.out.println("Resultado: " + resultado);
				System.out.println("Delgadez leve");

			} else if (resultado >= 18.50 && resultado <= 24.99) {
				System.out.println("Resultado: " + resultado);
				System.out.println("Peso normal");

			} else if (resultado >= 25 && resultado <= 29.99) {
				System.out.println("Resultado: " + resultado);
				System.out.println("Sobrepeso");

			} else if (resultado >= 30) {
				System.out.println("Resultado: " + resultado);
				System.out.println("Obesidad");
			}

			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

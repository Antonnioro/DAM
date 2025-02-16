package psp5;

import java.util.Scanner;

public class Tabla {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		int numero = t.nextInt();
		for (int i = 1; i <= 10; i++) {
			int r = numero * i;
			System.out.println(numero + " X " + i + " = " + r);
		}

		t.close();

	}

}

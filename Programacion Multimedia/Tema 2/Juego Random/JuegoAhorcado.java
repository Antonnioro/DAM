package Ahorcado;

import java.util.Random;
import java.util.Scanner;

public class JuegoAhorcado {

	public static void main(String[] args) {
		String[] repertorio = { "Representar", "Perpendicular", "Juventud", "Contrarreloj", "Esternocleidomastoideo",
				"Supercalifragilisticoespialidoso", "Historiador", "Murcielago", "Onomatopeya", "Psicologo",
				"Eutrofizacion" };

		System.out.println("Bienvenido al juego del ahorcado");

		Random obj = new Random();
		int Ran_num = obj.nextInt(repertorio.length);

		String palabraElegida = repertorio[Ran_num];
		palabraElegida = palabraElegida.toUpperCase();

		String palabraOculta = palabraElegida.replaceAll("[A-Z]", "_ ");

		int vidas = 0;

		String intento;
		char letra;

		boolean repetida;
		String adivinacion = "";
		boolean enPalabra;

		Scanner scanner = new Scanner(System.in);

		while (vidas < 7 && palabraOculta.contains("_")) {

			System.out.println("\nPalabra actual: " + palabraOculta);

			int intentos = 7 - vidas;
			if (vidas != 0) {
				System.out.println("Te quedan " + intentos + " vidas restantes.");
			}

			System.out.print("Introduce una letra: ");
			intento = scanner.nextLine();
			intento = intento.toUpperCase();

			if (intento.isEmpty()) {
				System.out.println("Por favor, introduce una letra válida.");
				continue;
			}

			letra = intento.charAt(0);

			repetida = adivinacion.indexOf(letra) != -1;

			if (repetida) {
				System.out.println("Ya has introducido la letra: " + letra);
				continue;
			}

			adivinacion += letra;

			enPalabra = palabraElegida.indexOf(letra) != -1;

			if (enPalabra) {
				System.out.println(letra + " está presente en la palabra.");
				for (int position = 0; position < palabraElegida.length(); position++) {
					if (palabraElegida.charAt(position) == letra && palabraOculta.charAt(position) != letra) {
						palabraOculta = palabraOculta.replaceAll("_ ", "_");
						String palabra2;
						palabra2 = palabraOculta.substring(0, position) + letra + palabraOculta.substring(position + 1);
						palabra2 = palabra2.replaceAll("_", "_ ");
						palabraOculta = palabra2;
					}
				}
			} else {
				System.out.println(letra + " no está en la palabra.");
				vidas++;
			}
		}

		if (vidas == 7) {
			System.out.println("Has perdido, te has quedado sin vidas.");
		} else {
			System.out.println("\nLa palabra era: " + palabraElegida + "\n¡Lo has conseguido!");
		}

		scanner.close();

	}

}

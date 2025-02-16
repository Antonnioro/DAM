package psp6;

import java.time.LocalDateTime;

public class Tabla {

	public static void main(String[] args) throws InterruptedException {

		if (args.length == 0) {
			System.out.println("Error: No se proporcionó ningún argumento.");
			return;
		}

		int n = Integer.parseInt(args[0]);

		for (int i = 1; i <= 10; i++) {
			int r = n * i;
			System.out.println(LocalDateTime.now() + " ----- " + n + " X " + i + " = " + r);
		}

	}

}

package pspReto2;

public class Calculo {

	public static void main(String[] args) {

		int nA = Integer.parseInt(args[0]);

		int numeroA = nA;

		int nB = Integer.parseInt(args[1]);

		int numeroB = nB;

		if (args[2].equals("suma")) {
			int resultadoSuma = numeroA + numeroB;
			System.out.println(resultadoSuma);
		} else if (args[2].equals("resta")) {
			int resultadoResta = numeroA - numeroB;
			System.out.println(resultadoResta);
		} else if (args[2].equals("multiplicacion")) {
			int resultadoMulti = numeroA * numeroB;
			System.out.println(resultadoMulti);
		} else if (args[2].equals("division")) {
			int resultadoDivi = numeroA / numeroB;
			System.out.println(resultadoDivi);
		}

	}

}

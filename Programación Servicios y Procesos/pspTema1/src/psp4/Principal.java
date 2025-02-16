package psp4;

public class Principal {

	public static void main(String[] args) {

		try {

			String classpath = System.getProperty("java.class.path");

			ProcessBuilder processBuilder = new ProcessBuilder("java", "-cp", classpath, "psp4.Calculadora");

			processBuilder.inheritIO();

			Process process = processBuilder.start();

			int exitCode = process.waitFor();

			if (exitCode == 0) {
				System.out.println("El proceso Calculadora se ejecutó correctamente");
			} else {
				System.out.println("El proceso Calculadora terminó con errores");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package psp3;

//Hay que borrar el archivo java que se crea automáticamente con cada proyecto.

public class Principal {
	public static void main(String[] args) {

		try {
			String classpath = System.getProperty("java.class.path");

			ProcessBuilder processBuilder = new ProcessBuilder("java", "-cp", classpath, "psp3.Secundaria");
			ProcessBuilder processBuilder2 = new ProcessBuilder("java", "-cp", classpath, "psp3.Terciaria");
			ProcessBuilder processBuilder3 = new ProcessBuilder("java", "-cp", classpath, "psp3.Cuaternaria");

			processBuilder.inheritIO();
			processBuilder2.inheritIO();
			processBuilder3.inheritIO();

			Process process = processBuilder.start();

			int exitCode = process.waitFor();

			if (exitCode == 0) {
				System.out.println("El proceso Secundaria se ejecutó correctamente");
			} else {
				System.out.println("El proceso Secundaria terminó con errores");
			}

			Process process2 = processBuilder2.start();

			int exitCode2 = process2.waitFor();

			if (exitCode == 0) {
				System.out.println("El proceso Terciaria se ejecutó correctamente");
			} else {
				System.out.println("El proceso Terciaria terminó con errores");
			}

			Process process3 = processBuilder3.start();

			int exitCode3 = process3.waitFor();

			if (exitCode == 0) {
				System.out.println("El proceso Cuaternaria se ejecutó correctamente");
			} else {
				System.out.println("El proceso Cuaternaria terminó con errores");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package ejercicio11;

import java.io.FileInputStream;
import java.security.KeyStore;

public class VerificarKeystore {
	public static void main(String[] args) {
		
		try {
			String keystoreFile = "AlmacenSrv.jks";
			char[] password = "1234567".toCharArray();

			FileInputStream fis = new FileInputStream(keystoreFile);
			KeyStore ks = KeyStore.getInstance("JKS");
			ks.load(fis, password);
			fis.close();

			System.out.println("✅ Keystore cargado correctamente. Contenido:");
			System.out.println(ks.aliases().nextElement());

		} catch (Exception e) {
			System.out.println("❌ ERROR: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

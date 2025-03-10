package ejercicio13;

import java.security.*;

public class VerificarFirma {
	public static void main(String[] args) throws Exception {
		
        KeyPairGenerator generadorClaves = KeyPairGenerator.getInstance("RSA");
        generadorClaves.initialize(2048);
        KeyPair parClaves = generadorClaves.generateKeyPair();

        String mensaje = "Mensaje importante";

        Signature firma = Signature.getInstance("SHA256withRSA");
        firma.initSign(parClaves.getPrivate());
        firma.update(mensaje.getBytes());
        byte[] firmaGenerada = firma.sign();

        Signature verificarFirma = Signature.getInstance("SHA256withRSA");
        verificarFirma.initVerify(parClaves.getPublic());
        verificarFirma.update(mensaje.getBytes());

        boolean esValida = verificarFirma.verify(firmaGenerada);
        System.out.println("¿Firma válida? " + esValida);
    }
}

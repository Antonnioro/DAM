package ejercicio11;

import java.io.FileOutputStream;
import java.math.BigInteger;
import java.security.*;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.cert.X509v3CertificateBuilder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;

public class GenerarKeystore {
	public static void main(String[] args) throws Exception {

		String keystoreFile = "AlmacenSrv.jks";
		char[] password = "1234567".toCharArray();
		String alias = "servidor";

		KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
		keyPairGen.initialize(2048);
		KeyPair keyPair = keyPairGen.generateKeyPair();

		X509Certificate cert = generarCertificado(keyPair);

		KeyStore ks = KeyStore.getInstance("JKS");
		ks.load(null, null);
		ks.setKeyEntry(alias, keyPair.getPrivate(), password, new java.security.cert.Certificate[] { cert });

		try (FileOutputStream fos = new FileOutputStream(keystoreFile)) {
			ks.store(fos, password);
		}

		System.out.println("✅ Keystore generado correctamente: " + keystoreFile);
	}

	private static X509Certificate generarCertificado(KeyPair keyPair) throws Exception {
		Calendar cal = Calendar.getInstance();
		Date fechaInicio = cal.getTime();
		cal.add(Calendar.YEAR, 1);
		Date fechaFin = cal.getTime();

		X500Principal dnName = new X500Principal("CN=ServidorSSL");
		BigInteger serialNumber = new BigInteger(64, new SecureRandom());

		X509v3CertificateBuilder certBuilder = new JcaX509v3CertificateBuilder(dnName, serialNumber, fechaInicio,
				fechaFin, dnName, keyPair.getPublic());

		ContentSigner signer = new JcaContentSignerBuilder("SHA256WithRSA").build(keyPair.getPrivate());

		return new JcaX509CertificateConverter().getCertificate(certBuilder.build(signer));
	}
}

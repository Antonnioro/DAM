package email;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class FtpSubir {
	public static void main(String[] args) {

		FTPClient cliente = new FTPClient();
		String ftp = "demo.wftpserver.com";
		String user = "demo";
		String password = "demo";
		int port = 21;

		try {
			System.out.println("Conectando al servidor FTP...");
			cliente.connect(ftp, port);
			boolean login = cliente.login(user, password);

			if (login) {
				System.out.println("Conexión establecida con el servidor FTP");

				cliente.setFileType(FTP.BINARY_FILE_TYPE);
				cliente.setFileTransferMode(FTP.BINARY_FILE_TYPE);
				cliente.enterLocalPassiveMode();

				File fichero = new File("PruebaAnto.txt");
				String ficheroRemoto = "upload/PruebaAnto.txt";

				FileInputStream entrada = new FileInputStream(fichero);

				System.out.println("Subiendo archivo al servidor FTP...");
				boolean done = cliente.storeFile(ficheroRemoto, entrada);

				entrada.close();

				if (done) {
					System.out.println("La subida ha finalizado con éxito");
				} else {
					System.out.println("La subida ha fallado");
				}

				// Cerrar sesión y desconectar
				cliente.logout();
				cliente.disconnect();
			} else {
				System.out.println("Conexión no establecida con el servidor FTP");
			}
		} catch (IOException e) {
			System.out.println("No se ha podido subir el fichero");
			System.out.println("Error: " + e.getMessage());
		}

	}

}

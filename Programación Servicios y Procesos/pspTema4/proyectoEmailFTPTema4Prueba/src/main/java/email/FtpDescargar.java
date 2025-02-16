package email;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class FtpDescargar {
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

				File fichero = new File("Summer.jpg");
				OutputStream salida = new BufferedOutputStream(new FileOutputStream(fichero));

				System.out.println("Espera mientras se realiza la descarga....");
				boolean ok = cliente.retrieveFile("download/Summer.jpg", salida);

				salida.close();

				if (ok) {
					System.out.println("La descarga ha finalizado con éxito");
				} else {
					System.out.println("La descarga no se ha realizado");
				}

				cliente.logout();
				cliente.disconnect();
			} else {
				System.out.println("Conexión no establecida con el servidor FTP");
			}
		} catch (IOException e) {
			System.out.println("No se ha podido descargar el fichero");
			System.out.println("Error: " + e.getMessage());
		}

	}

}

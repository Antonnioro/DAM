package ejerciciosBasicos;

//Path Host Query

import java.net.URI;

public class Ejercicio2InfoHostLocal {

	public static void main(String[] args) {

		String url = "https://www.elcorteingles.es/search/?s=portatiles";

		URI uri = URI.create(url);

		System.out.println("Path: " + uri.getPath());
		System.out.println("Host: " + uri.getHost());
		System.out.println("Query: " + uri.getQuery());
	}
}
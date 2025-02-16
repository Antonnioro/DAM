package proyectoSoap2;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;


public class AemetServiceClient {
    public static void main(String[] args) {
        try {
            URL wsdlURL = new URL("https://opendata.aemet.es/opendata/api/municipios/28079/valores/climatologicos/anualidad/2023?api_key=eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ5cnV3ZWlxb0B5b3BtYWlsLmNvbSIsImp0aSI6ImFkMWJiYTYwLTk3M2MtNDFmZC1iOTRjLTExZmZhNGQyOWVjMyIsImlzcyI6IkFFTUVUIiwiaWF0IjoxNzM3NzIxODU5LCJ1c2VySWQiOiJhZDFiYmE2MC05NzNjLTQxZmQtYjk0Yy0xMWZmYTRkMjllYzMiLCJyb2xlIjoiIn0.47m_PiiIUU2732yFycUV1g0nLY7LYoiFGhuzNDtrNB8");
            QName qname = new QName("http://opendata.aemet.es", "AemetService");


            Service service = Service.create(wsdlURL, qname);
            AemetService aemet = service.getPort(AemetService.class);


            String resultado = aemet.getWeather("Sevilla");
            System.out.println("El tiempo en Madrid: " + resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package proyectoSoap2;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface AemetService {

	@WebMethod
	String getWeather(String ciudad);
}

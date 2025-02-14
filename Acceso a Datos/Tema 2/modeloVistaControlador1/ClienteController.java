package modeloVistaControlador1;

import java.sql.SQLException;
import java.util.List;

public class ClienteController {

	private ClienteModel model;
	private ClienteView view;

	public ClienteController(String dbURL, String dbUser, String dbPassword) throws SQLException {
		model = new ClienteModel(dbURL, dbUser, dbPassword);
		view = new ClienteView();
	}

	public void mostrarClientes() throws SQLException {
		List<Cliente> clientes = model.getAllClientes();
		view.mostrarClientes(clientes);
	}

	public void cerrarConexion() throws SQLException {
		model.close();
	}

}

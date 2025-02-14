package modeloVistaControlador2;

import java.sql.SQLException;
import java.util.List;

public class ProductoController {

	private ProductoModel model;
	private ProductoView view;

	public ProductoController(String dbURL, String dbUser, String dbPassword) throws SQLException {
		model = new ProductoModel(dbURL, dbUser, dbPassword);
		view = new ProductoView();
	}

	public void mostrarProductos() throws SQLException {
		List<Producto> productos = model.getAllProductos();
		view.mostrarProductos(productos);
	}

	public void cerrarConexion() throws SQLException {
		model.close();
	}

}

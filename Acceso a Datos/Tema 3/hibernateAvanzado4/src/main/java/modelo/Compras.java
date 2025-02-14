package modelo;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "compras")

public class Compras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcompras")
	private int idcompras;

	@Column(name = "fecha")
	private Date fecha;

	@Column(name = "unidades")
	private int unidades;

	@ManyToOne
	@JoinColumn(name = "id_producto", nullable = false)
	private Producto producto;

	public Compras() {

	}

	public Compras(Date fecha, int unidades, Producto producto) {
		this.fecha = fecha;
		this.unidades = unidades;
		this.producto = producto;
	}

	public int getIdcompras() {
		return idcompras;
	}

	public void setIdcompras(int idcompras) {
		this.idcompras = idcompras;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Compras [idcompras=" + idcompras + ", fecha=" + fecha + ", unidades=" + unidades + ", producto="
				+ producto + "]";
	}

}

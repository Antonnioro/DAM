package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "producto")

public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "precio")
	private Double precio;

	@ManyToOne
	@JoinColumn(name = "codigo_fabricante", nullable = false)
	private Fabricante fabricante;

	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
	private List<Compras> compras = new ArrayList<>();

	public Producto() {

	}

	public Producto(String nombre, Double precio, Fabricante fabricante) {
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public List<Compras> getCompras() {
		return compras;
	}

	public void setCompras(List<Compras> compras) {
		this.compras = compras;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante="
				+ fabricante.getNombre() + "]";
	}

}

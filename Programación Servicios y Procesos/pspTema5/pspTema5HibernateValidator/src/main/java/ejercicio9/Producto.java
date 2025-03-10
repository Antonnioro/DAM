package ejercicio9;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Min;

public class Producto {

	@NotBlank(message = "El nombre del producto no puede estar vacío")
	private String nombre;

	@Positive(message = "El precio debe ser mayor a 0")
	private double precio;

	@Min(value = 0, message = "El stock no puede ser negativo")
	private int stock;

	public Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}

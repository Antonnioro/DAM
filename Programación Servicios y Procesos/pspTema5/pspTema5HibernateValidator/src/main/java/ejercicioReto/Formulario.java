package ejercicioReto;

import java.time.LocalDate;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Positive;

public class Formulario {

	@NotBlank(message = "El nombre no puede estar vacío")
	private String nombre;

	@NotBlank(message = "El apellido no puede estar vacío")
	private String apellido;

	@Min(value = 18, message = "La edad debe ser mayor o igual a 18 años.")
	private int edad;

	@Pattern(regexp = "\\d{9}$", message = "El teléfono debe contener 9 dígitos")
	private String telefono;

	@Email(message = "Debes meter un email válido")
	private String email;

	@Pattern(regexp = "\\d{5}", message = "El código postal debe tener 5 dígitos")
	private String codigoPostal;

	@Past(message = "La fecha de nacimiento debe estar en el pasado")
	private LocalDate fechaNacimiento;

	@FutureOrPresent(message = "La fecha de check-in debe ser hoy o en el futuro")
	private LocalDate checkIn;

	@Future(message = "La fecha de check-out debe estar en el futuro")
	private LocalDate checkOut;

	@Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).*$", message = "La contraseña debe contener al menos una mayúscula, una minúscula y un número")
	private String password;
	
	@Positive(message = "El saldo debe ser mayor a 0")
	private double saldo;
	

	public Formulario(String nombre, String apellido, int edad, String telefono, String email,
			String codigoPostal, LocalDate fechaNacimiento, LocalDate checkIn, LocalDate checkOut, String password, double saldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
		this.codigoPostal = codigoPostal;
		this.fechaNacimiento = fechaNacimiento;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.password = password;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}

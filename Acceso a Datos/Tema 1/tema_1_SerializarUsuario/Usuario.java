package tema_1_SerializarUsuario;

import java.io.Serializable;

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellidos;
	private String nick;
	private String email;
	private String contrasena;

	public Usuario(String nombre, String apellidos, String nick, String email, String contrasena) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nick = nick;
		this.email = email;
		this.contrasena = contrasena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", nick=" + nick + ", email=" + email
				+ ", contrasena=" + contrasena + "]";
	}

}

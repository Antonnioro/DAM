package modelo;

import javax.persistence.*;

@Entity
@Table(name = "citas")

public class Citas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "id_paciente")
	private int id_paciente;

	@Column(name = "id_medico")
	private int id_medico;

	@Column(name = "fecha")
	private String fecha;

	@Column(name = "hora")
	private double hora;

	public Citas() {

	}

	public Citas(int id, int id_paciente, int id_medico, String fecha, double hora) {
		this.id = id;
		this.id_paciente = id_paciente;
		this.id_medico = id_medico;
		this.fecha = fecha;
		this.hora = hora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public int getId_medico() {
		return id_medico;
	}

	public void setId_medico(int id_medico) {
		this.id_medico = id_medico;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Citas [id=" + id + ", id_paciente=" + id_paciente + ", id_medico=" + id_medico + ", fecha=" + fecha
				+ ", hora=" + hora + "]";
	}

}

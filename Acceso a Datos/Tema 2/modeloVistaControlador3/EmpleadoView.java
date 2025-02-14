package modeloVistaControlador3;

import java.util.List;

public class EmpleadoView {
	public void mostrarEmpleados(List<Empleado> empleados) {
		for (Empleado empleado : empleados) {
			System.out.println("ID: " + empleado.getId());
			System.out.println("Nombre: " + empleado.getNombre());
			System.out.println("Apellido: " + empleado.getApellido());
			System.out.println("Email: " + empleado.getEmail());
			System.out.println("Telefono: " + empleado.getTelefono());
			System.out.println("Direccion: " + empleado.getDireccion());
			System.out.println("Salario: " + empleado.getSalario());
			System.out.println("Fecha de Contratacion: " + empleado.getFecha_contratacion());
			System.out.println();
		}

	}

}

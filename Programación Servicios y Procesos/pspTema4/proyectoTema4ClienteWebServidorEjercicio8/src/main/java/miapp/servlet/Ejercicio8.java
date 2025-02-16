package miapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ejercicio8")
public class Ejercicio8 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String ciudad = request.getParameter("ciudad");
		String provincia = request.getParameter("provincia");
		String domicilio = request.getParameter("domicilio");
		String email = request.getParameter("email");

		int edad = Integer.parseInt(request.getParameter("edad"));
		int telefono = Integer.parseInt(request.getParameter("telefono"));

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><body>");

		out.println("<h2>Hola, " + nombre + " " + apellidos + ", tienes " + edad + " años.</h2>");
		out.println("<h2>Vives en la ciudad de, " + ciudad + ", en la provincia de " + provincia + ", concretamente en "
				+ domicilio + ".</h2>");
		out.println("<h2>Este es tu numero de teléfono " + telefono + " y tu correo " + email + ".</h2>");

		out.println("</body></html>");
	}
}

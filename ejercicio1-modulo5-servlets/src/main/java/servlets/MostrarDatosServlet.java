package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.HtmlUtils;

import java.io.IOException;

/**
 * Servlet implementation class MostrarDatosServlet
 */
@WebServlet(description = "Procesar los datos enviados desde el formulario y mostrar el resultado", urlPatterns = { "/MostrarDatosServlet" })
public class MostrarDatosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		
		//Escapar el contenido antes de mostrarlo
		nombre = HtmlUtils.escapeHtml(nombre);
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		//Generar la respuesta HTML
		response.getWriter().println("<!DOCTYPE html>");
		response.getWriter().println("<html>");
		response.getWriter().println("<head>");
		response.getWriter().println("<title>Resultado</title>");
		response.getWriter().println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
		response.getWriter().println("</head>");
		response.getWriter().println("<body>");
		response.getWriter().println("<div class='container mt-5'>");
		response.getWriter().println("<div class='card shadow-lg'>");
		response.getWriter().println("<div class='card-body'>");
		response.getWriter().println("<h3 class='text-center text-success'>Resultado del Formulario</h3>");

		if (nombre != null && !nombre.isEmpty()) {
		    response.getWriter().println("<p class='text-center'>Nombre ingresado: <strong>" + HtmlUtils.escapeHtml(nombre) + "</strong></p>");
		} else {
		    response.getWriter().println("<p class='text-center text-danger'>No se ingresó un nombre.</p>");
		}

		response.getWriter().println("<div class='text-center mt-3'>");
		response.getWriter().println("<a href='FormularioServlet' class='btn btn-secondary'>Volver al Formulario</a>");
		response.getWriter().println("</div>");
		response.getWriter().println("</div>");
		response.getWriter().println("</div>");
		response.getWriter().println("</div>");
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");

	}

}

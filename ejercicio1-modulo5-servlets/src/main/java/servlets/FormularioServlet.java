package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class FormularioServlet
 */
@WebServlet(description = "Este servlet genera un formulario HTML de manera dinámica. Solo se encarga de presentar el formulario.", urlPatterns = { "/FormularioServlet" })
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		//Generar formulario
		response.getWriter().println("<!DOCTYPE html>");
		response.getWriter().println("<html>");
		response.getWriter().println("<head>");
		response.getWriter().println("<title>Formulario</title>");
		response.getWriter().println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
		response.getWriter().println("</head>");
		response.getWriter().println("<body>");
		response.getWriter().println("<div class='container mt-5'>");
		response.getWriter().println("<div class='card shadow-lg'>");
		response.getWriter().println("<div class='card-body'>");
		response.getWriter().println("<h4 class='text-center text-primary'>Ingrese su Nombre</h4>");
		response.getWriter().println("<form action='MostrarDatosServlet' method='get'>");
		response.getWriter().println("<div class='mb-3'>");
		response.getWriter().println("<label for='nombre' class='form-label'>Nombre:</label>");
		response.getWriter().println("<input type='text' class='form-control' id='nombre' name='nombre' required>");
		response.getWriter().println("</div>");
		response.getWriter().println("<button type='submit' class='btn btn-primary w-100'>Enviar</button>");
		response.getWriter().println("</form>");
		response.getWriter().println("</div>");
		response.getWriter().println("</div>");
		response.getWriter().println("</div>");
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");

		
	}

}

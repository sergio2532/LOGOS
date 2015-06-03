package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conexion.Conexion;
import logica.colegio.Curso;
import modelo.ModeloCurso;

/**
 * Servlet implementation class curso
 */
@WebServlet("/curso")
public class curso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public curso() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Conexion conexion = new Conexion();
		conexion.conectar();
		
		request.getSession().setAttribute("cursos", new Curso().buscarTodosCursos(conexion));
		response.sendRedirect("cursos.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Conexion conexion = new Conexion();		
		String nombreCurso = request.getParameter("numero") + request.getParameter("letra");
		ModeloCurso curso = new ModeloCurso();
		
		conexion.conectar();
		curso.setNombreCurso(nombreCurso);
		new Curso().crearCurso(curso, conexion);
		response.sendRedirect("/LOGOS/curso");
		
		
	}

}

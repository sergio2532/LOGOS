package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logica.colegio.Asignatura;
import logica.colegio.Curso;
import logica.usuarios.Docente;
import conexion.Conexion;

/**
 * Servlet implementation class asignaturacurso
 */
@WebServlet("/asignaturacurso")
public class asignaturacurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public asignaturacurso() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean flagCrear = Boolean.parseBoolean(request.getParameter("flagCrear"));
		Conexion conexion = new Conexion();
		
		if(flagCrear){
			conexion.conectar();
			request.getSession().setAttribute("cursos", new Curso().buscarTodosCursos(conexion));
			request.getSession().setAttribute("asignaturas", new Asignatura().buscarTodasAsignaturas(conexion));
			request.getSession().setAttribute("docentes", new Docente().buscarTodosUsuarios(conexion));
			response.sendRedirect("crearCursoReal.jsp");
		}
		else{
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

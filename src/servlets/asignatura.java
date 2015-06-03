package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conexion.Conexion;
import logica.colegio.Asignatura;
import modelo.ModeloAsignatura;

/**
 * Servlet implementation class asignatura
 */
@WebServlet("/asignatura")
public class asignatura extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public asignatura() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Conexion conexion = new Conexion();
		conexion.conectar();
		
		request.getSession().setAttribute("asignaturas", new Asignatura().buscarTodasAsignaturas(conexion));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Conexion conexion = new Conexion();
		conexion.conectar();
		
		ModeloAsignatura asignatura = new ModeloAsignatura();
		asignatura.setIdArea(Integer.parseInt(request.getParameter("")));
		asignatura.setIntensidadHoraria(Integer.parseInt(request.getParameter("")));
		asignatura.setNombreAsignatura(request.getParameter(""));
		
		new Asignatura().crearAsignatura(asignatura, conexion);
	}

}

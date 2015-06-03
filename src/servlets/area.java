package servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conexion.Conexion;
import logica.colegio.Area;
import modelo.ModeloArea;

/**
 * Servlet implementation class area
 */
@WebServlet("/area")
public class area extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public area() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("sirveeee !!!!!! ujuuu ");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Conexion conexion = new Conexion();
		conexion.conectar();
		request.getSession().setAttribute("areas", new Area().buscarTodasAreas(conexion));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Conexion conexion = new Conexion();
		conexion.conectar();
		
		ModeloArea area = new ModeloArea();
		area.setIntensidadHoraria(Integer.parseInt(request.getParameter("")));
		area.setNombreArea(request.getParameter("nombreArea"));
		
		new Area().crearArea(area, conexion);
	}

}

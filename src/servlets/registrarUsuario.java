package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conexion.Conexion;
import logica.usuarios.*;

/**
 * Servlet implementation class registrarUsuario
 */
@WebServlet("/registrarUsuario")
public class registrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Conexion conexion = new Conexion();
		conexion.conectar();
		Usuario usuario;
		
		String nombre = request.getParameter("nombre");
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		String fechaNacimiento = request.getParameter("datepicker");
		String tipo = request.getParameter("tipo");
		String clave = "123";
		String estado = "activo";
		String tipoidentificacion = request.getParameter("tipoIdentificacion");
		int identificacion = Integer.parseInt(request.getParameter("identificacion"));
		
		if(tipo == "estudiante"){
			usuario = new Estudiante(nombre, codigo, fechaNacimiento, tipo,
					clave, estado, tipoidentificacion, identificacion);
		}else{
			usuario = new Docente(nombre, codigo, fechaNacimiento, tipo,
					clave, estado, tipoidentificacion, identificacion);
		}
		
		usuario.crearUsuario(conexion, usuario.getUsuario());
	}

}

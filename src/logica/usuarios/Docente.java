package logica.usuarios;

import modelo.ModeloUsuario;

import java.sql.*;

import conexion.Conexion;

public class Docente extends Usuario {

	public Docente(String nombre, int codigo, String fechaNacimiento, String tipo,
			String clave, String estado, String tipoidentificacion, int identificacion) {
		super(nombre, codigo, fechaNacimiento, tipo,
				clave, estado, tipoidentificacion, identificacion);
		// TODO Auto-generated constructor stub
	}
	
	public Docente(ModeloUsuario usuario){
		super(usuario);
	}

	@Override
	public void crearUsuario(Conexion conexion, ModeloUsuario usuario) {
		Connection con = conexion.getConexion();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM \"Area\"");
			
			while(rs.next()){
				System.out.println(rs.getString("nombreArea"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(conexion.getMensaje());
			e.printStackTrace();
		}
	}

	@Override
	public void editarUsuario(Conexion conexion, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ModeloUsuario buscarUsuario(Conexion conexion, int id) {
		return usuario;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarUsuario(Conexion conexion, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	Object clonar(Usuario usuario) {
		return new Docente(super.getUsuario());
	}

	@Override
	public ResultSet buscarTodosUsuarios(Conexion conexion) {
		// TODO Auto-generated method stub
		return null;
	}

}

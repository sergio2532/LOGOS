package logica.usuarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.Conexion;
import modelo.ModeloUsuario;

public class Estudiante extends Usuario{


	public Estudiante(String nombre, int codigo, String fechaNacimiento, String tipo,
			String clave, String estado, String tipoidentificacion, int identificacion) {
		super(nombre, codigo, fechaNacimiento, tipo,
				clave, estado, tipoidentificacion, identificacion);
		// TODO Auto-generated constructor stub
	}
	
	public Estudiante(){
		
	}
	
	public Estudiante(ModeloUsuario usuario){
		super(usuario);
	}

	@Override
	public void crearUsuario(Conexion conexion, ModeloUsuario usuario) {
		Connection con = conexion.getConexion();
		try {
			String sql = "INSERT * INTO usuario "
					+"(nombreusuario, claveusuario, codigousuario, estado, fechanacimiento,"
					+ "tipoidentificacion, identificacion, tipousuario)"
					+ "values(?, ?, ?, ?, ? , ? , ?, ?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, usuario.getName());
			pst.setString(2, usuario.getClave());
			pst.setInt(3, usuario.getCodigo());
			pst.setString(4, usuario.getEstado());
			pst.setString(5, usuario.getFechaNacimiento());
			pst.setString(6, usuario.getTipoIdentificacion());
			pst.setInt(7, usuario.getIdentinficacion());
			pst.setString(8, usuario.getTipo());
			
			pst.executeUpdate();
			
			conexion.desconectar();
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
		return new Estudiante(super.getUsuario());
	}

	@Override
	public ResultSet buscarTodosUsuarios(Conexion conexion) {
		// TODO Auto-generated method stub
		return null;
	}

}

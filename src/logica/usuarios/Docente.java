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
			String sql = "INSERT INTO usuario "
					+"(nombreusuario, claveusuario, codigousuario, estado, fechanacimiento,"
					+ "tipoidentificacion, identificacion, tipousuario)"
					+ "values(?, ?, ?, ?, ? , ? , ?, ?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, usuario.getName());
			pst.setString(2, usuario.getClave());
			pst.setInt(3, usuario.getCodigo());
			pst.setString(4, usuario.getEstado());
			pst.setDate(5, new Date(19930813));
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
		return new Docente(super.getUsuario());
	}

	@Override
	public ResultSet buscarTodosUsuarios(Conexion conexion) {
		// TODO Auto-generated method stub
		return null;
	}

}

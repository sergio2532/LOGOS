package logica.usuarios;

import java.sql.ResultSet;

import conexion.Conexion;
import modelo.ModeloUsuario;

public abstract class Usuario {
	ModeloUsuario usuario;
	
	public Usuario(){
		
	}
	
	public Usuario(String nombre, int codigo, String fechaNacimiento, String tipo,
			String clave, String estado, String tipoidentificacion, int identificacion){
		this.usuario = new ModeloUsuario(nombre, codigo, fechaNacimiento, tipo,
				clave, estado, tipoidentificacion, identificacion);
	}
	
	public Usuario(ModeloUsuario usuario) {
		this.usuario = usuario;
	}
	
	public ModeloUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(ModeloUsuario usuario) {
		this.usuario = usuario;
	}

	abstract Object clonar(Usuario usuario);
	public abstract void crearUsuario(Conexion conexion, ModeloUsuario usuario);
	public abstract void editarUsuario(Conexion conexion, int id);
	public abstract ModeloUsuario buscarUsuario(Conexion conexion, int id);
	public abstract ResultSet buscarTodosUsuarios(Conexion conexion);
	public abstract void eliminarUsuario(Conexion conexion, int id);
	
}

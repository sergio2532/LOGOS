package logica.colegio;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.Conexion;
import logica.usuarios.Docente;
import logica.usuarios.Estudiante;
import modelo.*;
import modelo.ModeloUsuario;

public class AsignaturaCurso {
	ModeloUsuario docente;
	ModeloUsuario []estudiante;
	ModeloCurso curso;
	ModeloAsignatura asignatura;
	
	public Asignatura getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public Estudiante[] getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante[] estudiante) {
		this.estudiante = estudiante;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void guaradarCurso(){
		
	}
	
	public void crearAsignatura(Conexion conexion){
		Connection con = conexion.getConexion();
		try {
			String sql = "INSERT INTO asignatura "
					+"(nombreasignatura, intensidadhoraria, idarea)"
					+ "values(?, ?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, );
			pst.setInt(2, asignatura.getIdArea());
			
			pst.executeUpdate();
			
			conexion.desconectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(conexion.getMensaje());
			e.printStackTrace();
		} 
		
	}
	
	public ResultSet buscarTodasAsignaturas(Conexion conexion){
		Connection con = conexion.getConexion();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM asignatura asig, area ar WHERE asig.idarea = ar.idarea");
			
			return rs;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(conexion.getMensaje());
			e.printStackTrace();
		}
		return null;
	}
	
}

package logica.colegio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.ModeloCurso;
import conexion.Conexion;

public class Curso {
	public void crearCurso(ModeloCurso curso, Conexion conexion){
		Connection con = conexion.getConexion();
		try {
			String sql = "INSERT INTO curso "
					+"(nombrearea, intensidadhorariaarea)"
					+ "values(?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, curso.getNombreCurso());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(conexion.getMensaje());
			e.printStackTrace();
		} 
		
	}
	
	public ResultSet buscarTodosCursos(Conexion conexion){
		Connection con = conexion.getConexion();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM curso");
			
			return rs;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(conexion.getMensaje());
			e.printStackTrace();
		}
		return null;
	}
}

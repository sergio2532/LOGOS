package logica.colegio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.ModeloAsignatura;
import conexion.Conexion;

public class Asignatura {
	public Asignatura(){
		
	}
	
	public void crearAsignatura(ModeloAsignatura asignatura, Conexion conexion){
		Connection con = conexion.getConexion();
		try {
			String sql = "INSERT INTO asignatura "
					+"(nombreasignatura, intensidadhoraria, idarea)"
					+ "values(?, ?, ? )";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, asignatura.getNombreAsignatura());
			pst.setInt(2, asignatura.getIntensidadHoraria());
			pst.setInt(3, asignatura.getIdArea());
			
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

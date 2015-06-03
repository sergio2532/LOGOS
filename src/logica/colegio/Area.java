package logica.colegio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.Conexion;
import modelo.ModeloArea;

public class Area {
	public Area (){
		
	}
	
	public void crearArea(ModeloArea area, Conexion conexion){
		Connection con = conexion.getConexion();
		try {
			String sql = "INSERT INTO area "
					+"(nombrearea, intensidadhorariaarea)"
					+ "values(?, ?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, area.getNombreArea());
			pst.setInt(2, area.getIntensidadHoraria());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(conexion.getMensaje());
			e.printStackTrace();
		} 
		
	}
	
	public ResultSet buscarTodasAreas(Conexion conexion){
		Connection con = conexion.getConexion();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM area");
			
			return rs;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(conexion.getMensaje());
			e.printStackTrace();
		}
		return null;
	}
}

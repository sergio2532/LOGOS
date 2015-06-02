package conexion;

import java.sql.*;

public class Conexion {
	private Connection conexion;
	String url = "jdbc:postgresql://localhost:5432/test";
	String user = "postgres";
	String password = "root";
	String mensaje = "";
	
	public void conectar(){
		try{
			Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
		}catch(SQLException e){
			mensaje = e.getMessage();
		}catch(ClassNotFoundException e){
			mensaje = e.getMessage();
		}
	}
	
	public void desconectar (){
		conexion = null;
	}

	public Connection getConexion() {
		return conexion;
	}
	
	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getMensaje() {
		return mensaje;
	}
}

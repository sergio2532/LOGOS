package modelo;

public class ModeloAsignatura {
	int idAsignatura;
	String nombreAsignatura;
	int intensidadHoraria;
	int idArea;
	
	public ModeloAsignatura(){
		
	}
	
	public ModeloAsignatura(int idAsignatura, String nombreAsignatura, int intensidadHoraria, int idArea){
		this.idAsignatura = idAsignatura;
		this.nombreAsignatura = nombreAsignatura;
		this.intensidadHoraria = intensidadHoraria;
		this.idArea = idArea;
	}

	public int getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public int getIntensidadHoraria() {
		return intensidadHoraria;
	}

	public void setIntensidadHoraria(int intensidadHoraria) {
		this.intensidadHoraria = intensidadHoraria;
	}

	public int getIdArea() {
		return idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}
	
	
}

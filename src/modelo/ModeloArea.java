package modelo;

public class ModeloArea {
	int idArea;
	String nombreArea;
	int intensidadHoraria;
	
	public ModeloArea(){
		
	}
		
	public ModeloArea(int idArea, String nombreArea, int intensidadHoraria){
		this.idArea = idArea;
		this.intensidadHoraria = intensidadHoraria;
		this.nombreArea = nombreArea;
	}

	public int getIdArea() {
		return idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	public int getIntensidadHoraria() {
		return intensidadHoraria;
	}

	public void setIntensidadHoraria(int intensidadHoraria) {
		this.intensidadHoraria = intensidadHoraria;
	}
	
}

package modelo;

public class ModeloArea {
	int idArea;
	int nombreArea;
	int intensidadHoraria;
	
	public ModeloArea(){
		
	}
		
	public ModeloArea(int idArea, int nombreArea, int intensidadHoraria){
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

	public int getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(int nombreArea) {
		this.nombreArea = nombreArea;
	}

	public int getIntensidadHoraria() {
		return intensidadHoraria;
	}

	public void setIntensidadHoraria(int intensidadHoraria) {
		this.intensidadHoraria = intensidadHoraria;
	}
	
	
}

package modelo;

public class ModeloSalon {
	int idSalon;
	int noSalon;
	int pisoSalon;
	
	public ModeloSalon(){
		
	}
	
	public ModeloSalon(int idSalon, int noSalon, int pisoSalon){
		this.idSalon = idSalon;
		this.noSalon = noSalon;
		this.pisoSalon = pisoSalon;
	}

	public int getIdSalon() {
		return idSalon;
	}

	public void setIdSalon(int idSalon) {
		this.idSalon = idSalon;
	}

	public int getNoSalon() {
		return noSalon;
	}

	public void setNoSalon(int noSalon) {
		this.noSalon = noSalon;
	}

	public int getPisoSalon() {
		return pisoSalon;
	}

	public void setPisoSalon(int pisoSalon) {
		this.pisoSalon = pisoSalon;
	}
	
}

package modelo;

public class ModeloHorario {
	
	int idHorario;
	int idSalon;
	int idCurso;
	String dia;
	String hora;
	
	public ModeloHorario(){
	
	}
	
	public ModeloHorario(int idHorario, int idSalon, int idCurso, String dia, String hora){
		this.dia = dia;
		this.hora = hora;
		this.idCurso = idCurso;
		this.idHorario = idHorario;
		this.idSalon = idSalon;
	}

	public int getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}

	public int getIdSalon() {
		return idSalon;
	}

	public void setIdSalon(int idSalon) {
		this.idSalon = idSalon;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
}

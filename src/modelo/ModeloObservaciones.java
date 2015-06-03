package modelo;

public class ModeloObservaciones {
	int idObservaciones;
	String observacion;
	int idUsuario;
	int idCurso;
	
	public ModeloObservaciones(){
		
	}
	
	public ModeloObservaciones(int idObservaciones, String observacion, int idUsuario, int idCurso){
		this.idObservaciones = idObservaciones;
		this.observacion = observacion;
		this.idUsuario = idUsuario;
		this.idCurso = idCurso;
	}

	public int getIdObservaciones() {
		return idObservaciones;
	}

	public void setIdObservaciones(int idObservaciones) {
		this.idObservaciones = idObservaciones;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
}

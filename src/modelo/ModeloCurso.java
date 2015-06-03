package modelo;

public class ModeloCurso {
	int idCurso;
	String nombreCurso;
	int idAsignatura;
	
	public ModeloCurso(){
		
	}
	
	public ModeloCurso(int idCurso, String nombreCurso, int idAsignatura){
		this.idAsignatura = idAsignatura;
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
	
	
}

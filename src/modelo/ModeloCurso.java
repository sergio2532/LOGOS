package modelo;

public class ModeloCurso {
	int idCurso;
	int prefijoCurso;
	char letraCurso;
	int idAsignatura;
	
	public ModeloCurso(){
		
	}
	
	public ModeloCurso(int idCurso, int prefijoCurso, char letraCurso, int idAsignatura){
		this.idAsignatura = idAsignatura;
		this.idCurso = idCurso;
		this.letraCurso = letraCurso;
		this.prefijoCurso = prefijoCurso;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public int getPrefijoCurso() {
		return prefijoCurso;
	}

	public void setPrefijoCurso(int prefijoCurso) {
		this.prefijoCurso = prefijoCurso;
	}

	public char getLetraCurso() {
		return letraCurso;
	}

	public void setLetraCurso(char letraCurso) {
		this.letraCurso = letraCurso;
	}

	public int getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
	
	
}

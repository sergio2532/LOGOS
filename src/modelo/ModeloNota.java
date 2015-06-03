package modelo;

public class ModeloNota {
	int idNota;
	int valorNota;
	int parametricaNota;
	int idUsuario;
	int idCurso;
	
	public ModeloNota(){
		
	}
	
	public ModeloNota(int idNota, int valorNota, int parametricaNota, int idUsuario, int idCurso){
		this.idCurso = idCurso;
		this.idNota = idNota;
		this.idUsuario = idUsuario;
		this.parametricaNota = parametricaNota;
		this.valorNota = valorNota;
	}

	public int getIdNota() {
		return idNota;
	}

	public void setIdNota(int idNota) {
		this.idNota = idNota;
	}

	public int getValorNota() {
		return valorNota;
	}

	public void setValorNota(int valorNota) {
		this.valorNota = valorNota;
	}

	public int getParametricaNota() {
		return parametricaNota;
	}

	public void setParametricaNota(int parametricaNota) {
		this.parametricaNota = parametricaNota;
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

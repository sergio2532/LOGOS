package logica.colegio;

import logica.usuarios.Docente;
import logica.usuarios.Estudiante;

public abstract class builderAsignaturaCurso {
	protected AsignaturaCurso curso;
	
	public void crearAsignaturaCurso(){
		this.curso = new AsignaturaCurso();
	}
	
	public abstract void asignarDocente(Docente docente);
	public abstract void crearListadoEstudiantes(Estudiante[]estudiantes);
	public abstract void asignarCurso(Curso curso);
	
	public AsignaturaCurso getCurso() {
		return curso;
	}
	
	public void setCurso(AsignaturaCurso curso) {
		this.curso = curso;
	}
}

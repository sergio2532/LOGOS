package logica.colegio;

import logica.usuarios.Docente;
import logica.usuarios.Estudiante;

public class AsignaturaCurso {
	Docente docente;
	Estudiante []estudiante;
	Curso curso;
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public Estudiante[] getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante[] estudiante) {
		this.estudiante = estudiante;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}

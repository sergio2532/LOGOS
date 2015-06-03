package logica.colegio;

import logica.usuarios.*;

public class BuilderVacacional extends builderAsignaturaCurso{
	int capacidadCurso = 20;
	
	@Override
	public void asignarDocente(Docente docente) {
		super.curso.setDocente(docente);
	}

	@Override
	public void crearListadoEstudiantes(Estudiante []estudiantes) {
		super.curso.setEstudiante(estudiantes);
	}

	@Override
	public void asignarCurso(Curso curso) {
		super.curso.setCurso(curso);
		
	}

	@Override
	public void asignarAsignatura(Asignatura asignatura) {
		// TODO Auto-generated method stub
		
	}

}

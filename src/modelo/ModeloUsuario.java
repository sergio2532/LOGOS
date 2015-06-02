package modelo;

public class ModeloUsuario{
	
	String name;
	int codigo;
	int fechaNacimiento;
	int tipo;
	char tipoIdentificacion;
	int identinficacion;
	
	public ModeloUsuario(){
		
	}
	
	public ModeloUsuario(String name, int codigo, int fechaNacimiento, int tipo){
		this.name = name;
		this.codigo = codigo;
		this.fechaNacimiento = fechaNacimiento;
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public char getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(char tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public int getIdentinficacion() {
		return identinficacion;
	}

	public void setIdentinficacion(int identinficacion) {
		this.identinficacion = identinficacion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}

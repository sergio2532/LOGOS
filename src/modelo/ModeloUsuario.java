package modelo;

public class ModeloUsuario{
	
	int id;
	String name;
	int codigo;
	String clave;
	String fechaNacimiento;
	String estado;
	String tipo;
	String tipoIdentificacion;
	int identinficacion;
	
	public ModeloUsuario(){
		
	}
	
	public ModeloUsuario(String name, int codigo, String fechaNacimiento, String tipo,
			String clave, String estado, String tipoidentificacion, int identificacion){
		this.name = name;
		this.codigo = codigo;
		this.fechaNacimiento = fechaNacimiento;
		this.tipo = tipo;
		this.clave = clave;
		this.estado = estado;
		this.tipoIdentificacion = tipoidentificacion;
		this.identinficacion = identificacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public int getIdentinficacion() {
		return identinficacion;
	}

	public void setIdentinficacion(int identinficacion) {
		this.identinficacion = identinficacion;
	}

	
}

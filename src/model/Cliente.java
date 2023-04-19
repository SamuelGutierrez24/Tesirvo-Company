public class Cliente {

	private String nombre;
	private String id;
	private Date fechaDeRegistro;
	private String codigoDeContrato;
	private String direccionDeFacturacion;
	private String telefono;
	private String email;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	public Date getFechaDeRegistro() {
		return this.fechaDeRegistro;
	}

	/**
	 * 
	 * @param fechaDeRegistro
	 */
	public void setFechaDeRegistro(Date fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}

	public String getDireccionDeFacturacion() {
		return this.direccionDeFacturacion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccionDeFacturacion(String direccion) {
		this.direccionDeFacturacion = direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public Iterator<Contract> getIterator() {
		// TODO - implement Cliente.getIterator
		throw new UnsupportedOperationException();
	}

	public String getCodigoDeContrato() {
		return this.codigoDeContrato;
	}

	/**
	 * 
	 * @param codigoDeContrato
	 */
	public void setCodigoDeContrato(String codigoDeContrato) {
		this.codigoDeContrato = codigoDeContrato;
	}

}
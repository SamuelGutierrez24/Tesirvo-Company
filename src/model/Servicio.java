package model;

import java.util.Date;

public abstract class Servicio {

	private String id;
	private String direccionInstalacion;
	private Date fechaInstalacion;
	private Date fechaFacturacion;

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

	public String getDireccionInstalacion() {
		return this.direccionInstalacion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccionInstalacion(String direccion) {
		this.direccionInstalacion = direccion;
	}

	public EstadoServicio getEstadoServicio() {
		// TODO - implement Servicio.getEstadoServicio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param estadoServicio
	 */
	public boolean setEstadoServicio(String estadoServicio) {
		// TODO - implement Servicio.setEstadoServicio
		throw new UnsupportedOperationException();
	}

}
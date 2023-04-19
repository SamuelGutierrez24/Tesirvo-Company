package model;

import java.util.Date;

public abstract class Servicio {

	private String id;
	private String direccionInstalacion;
	private Date fechaInstalacion;
	private Date fechaFacturacion;
	private EstadoServicio estado;

	public Servicio(String id, String dir, Date fechaInstal, Date fechaFacturacion){
		this.id = id;
		direccionInstalacion = dir;
		fechaFacturacion = fechaInstal;
		this.fechaFacturacion = fechaFacturacion;
		estado = EstadoServicio.ACTIVO;
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
		return estado;
	}

	/**
	 * 
	 * @param estadoServicio
	 */
	public boolean setEstadoServicio(String estadoServicio) {
		boolean result = false;

		switch (estadoServicio){
			case "ACTIVO":
				estado = EstadoServicio.ACTIVO;
				result = !result;
				break;
			case "INACTIVO":
				estado = EstadoServicio.INACTIVO;
				result = !result;
				break;
		}

		return result;
	}

	public Date getFechaFacturacion() {
		return fechaFacturacion;
	}

	public Date getFechaInstalacion() {
		return fechaInstalacion;
	}

	public EstadoServicio getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "Informacion general: \nID: " + id + "\nDirecccion de instalacion: " + direccionInstalacion + "\nFecha de instalacion: "+ fechaInstalacion + "\nFecha de facturación: " + fechaFacturacion + "\nEstado: " + estado;
	}
}
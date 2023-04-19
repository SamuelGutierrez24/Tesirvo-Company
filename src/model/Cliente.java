package model;

import java.util.*;

public class Cliente implements Iterable<PaqueteDeServicios>{

	private String nombre;
	private String id;
	private Date fechaDeRegistro;
	private String codigoDeContrato;
	private String direccionDeFacturacion;
	private String telefono;
	private String email;
	private ArrayList<PaqueteDeServicios> paquetes;

	public Cliente(String nombre, String id, Date fechaDeRegistro, String codigoDeContrato, String direccionDeFacturacion, String telefono, String email){
		this.id = id;
		this.nombre = nombre;
		this.fechaDeRegistro = fechaDeRegistro;
		this.codigoDeContrato = codigoDeContrato;
		this.direccionDeFacturacion = direccionDeFacturacion;
		this.telefono = telefono;
		this.email = email;
		paquetes = new ArrayList<>();
	}

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

	@Override
	public Iterator<PaqueteDeServicios> iterator() {
		return paquetes.iterator();
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

	public String paquetesToString(){
		String result = "";
		for (PaqueteDeServicios p : paquetes){
			result += "\n" + p;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Cliente " + id +"\nNombre: " + nombre + "\nFecha de registro: " + fechaDeRegistro + "\nCodigo de contrato: " + codigoDeContrato + "\nTelefono: " + telefono + "\nEmail: " + email + "\n\nPaquetes: " + paquetesToString();
	}
}
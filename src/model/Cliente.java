package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	private Estado estado;

	private FactoryService factoryService;

	public Cliente(String nombre, String id, Date fechaDeRegistro, String codigoDeContrato, String direccionDeFacturacion, String telefono, String email, Estado estado){
		this.id = id;
		this.nombre = nombre;
		this.fechaDeRegistro = fechaDeRegistro;
		this.codigoDeContrato = codigoDeContrato;
		this.direccionDeFacturacion = direccionDeFacturacion;
		this.telefono = telefono;
		this.email = email;
		this.estado = estado;
		paquetes = new ArrayList<>();
	}

	public void crearServicio(String idPaquete, String idServicio, String tipoServicio, String direccionInstalacion, String fechaInstalacion, String fechaFacturacion, ArrayList<String> parametrosParticulares){
		String dateString1 = fechaFacturacion;
		String dateString2 = fechaInstalacion;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dateFechaFacturacion = dateFormat.parse(dateString1);
			Date dateFechaInstalacion = dateFormat.parse(dateString2);
			for (PaqueteDeServicios paquete: paquetes ) {
				if (paquete.getIdPaquete().equals(idPaquete)) {
					Servicio s;
					if (tipoServicio.equals("ServicioTelefonico")) s = factoryService.crearServicioTelefonico(parametrosParticulares.get(0), Integer.parseInt(parametrosParticulares.get(1)), Integer.parseInt(parametrosParticulares.get(2)), idServicio, direccionInstalacion, dateFechaInstalacion, dateFechaFacturacion);
					else if(tipoServicio.equals("ServicioInternet")) s = factoryService.crearServicioInternet(Integer.parseInt(parametrosParticulares.get(0)), parametrosParticulares.get(1), idServicio, direccionInstalacion, dateFechaInstalacion, dateFechaFacturacion);
					else if (tipoServicio.equals("ServicioBasico")) s = factoryService.CrearServicioBasico(Integer.parseInt(parametrosParticulares.get(0)), parametrosParticulares.get(1), idServicio, direccionInstalacion, dateFechaInstalacion, dateFechaFacturacion);
				}
			}
		} catch (ParseException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}


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

	public ArrayList<PaqueteDeServicios> getPaquetes() {
		return paquetes;
	}

	public void setPaquetes(ArrayList<PaqueteDeServicios> paquetes) {
		this.paquetes = paquetes;
	}

	public Servicio searchService(String id){
		for ()
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public FactoryService getFactoryService() {
		return factoryService;
	}

	public void setFactoryService(FactoryService factoryService) {
		this.factoryService = factoryService;
	}
}
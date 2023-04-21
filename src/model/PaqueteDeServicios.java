package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class PaqueteDeServicios {

	private ArrayList<Servicio> servicios;
	private Plan plan;

	public PaqueteDeServicios(String idPaquete) {
		this.idPaquete = idPaquete;
		servicios = new ArrayList<>();
	}

	public void anadirServicios(Servicio servicio) throws Exception{
		if(plan==null) servicios.add(servicio);
		else throw new Exception("this package has a plan");
	}

	public void inactivarServicio(String idServicio){
		for (Servicio servicio: servicios) {
			if(idServicio.equals(idServicio)){
				servicios.remove(servicio);
			}
		}
	}

	public Servicio buscarServicioEnPaquete(String id){
		for (Servicio servicio: servicios){
			if (servicio.getId().equals(id)){
				return servicio;
			}
		}
		return null;
	}

	public int buscarIndiceServicioEnPaquete(String id){
		int count = 0;
		for (Servicio servicio: servicios){
			if (servicio.getId().equals(id)){
				return count;
			}
			count++;
		}
		return count;
	}

	public void actualizarServicio(String id, String direccionInstalacion, Date fechaInstalacion, Date fechaFacturacion){
		servicios.get(buscarIndiceServicioEnPaquete(id)).setDireccionInstalacion(direccionInstalacion);
		servicios.get(buscarIndiceServicioEnPaquete(id)).setFechaInstalacion(fechaInstalacion);
		servicios.get(buscarIndiceServicioEnPaquete(id)).setFechaFacturacion(fechaFacturacion);
	}

	public ArrayList<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(ArrayList<Servicio> servicios) throws Exception{
		if(plan==null) this.servicios = servicios;
		else throw new Exception("this package has a plan");
	}

	private String idPaquete;

	public String getIdPaquete() {
		return this.idPaquete;
	}

	/**
	 * 
	 * @param idPaquete
	 */
	public void setIdPaquete(String idPaquete) {
		this.idPaquete = idPaquete;
	}

	public void setPlan(Plan plan){
		Servicio[] serv = BridgeCreadorPlan.getInstance().crearServiciosBasadoEnPlan(plan);

		for (Servicio s : serv){
			servicios.add(s);
		}
	}

}
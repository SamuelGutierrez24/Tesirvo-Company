package model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PaqueteDeServicios {

	private ArrayList<Servicio> servicios;
	private Plan plan;
	 private String idPaquete;
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

	public ArrayList<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(ArrayList<Servicio> servicios) throws Exception{
		if(plan==null) this.servicios = servicios;
		else throw new Exception("this package has a plan");
	}



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

	public String toString(){
		return "Codigo del paquete:" + getIdPaquete();
	}

	public String getId(){
		return idPaquete;
	}

}
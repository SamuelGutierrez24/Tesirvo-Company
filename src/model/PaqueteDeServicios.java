package model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PaqueteDeServicios {

	private ArrayList<Servicio> servicios;

	public PaqueteDeServicios(String idPaquete) {
		this.idPaquete = idPaquete;
		servicios = new ArrayList<>();
	}

	public void anadirServicios(Servicio servicio){
		servicios.add(servicio);
	}

	public void inactivarServicio(String idServicio){
		for (Servicio servicio: servicios) {
			if(idServicio.equals(idServicio)){
				servicios.remove(servicio);
			}
		}
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

}
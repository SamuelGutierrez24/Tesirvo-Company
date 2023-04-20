package model;

public class PaqueteDeServicios {

	public PaqueteDeServicios(String idPaquete) {
		this.idPaquete = idPaquete;
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
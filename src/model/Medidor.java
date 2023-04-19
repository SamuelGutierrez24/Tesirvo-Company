package model;

public class Medidor {

	private String identificacion;

	private Double mesActual;
	private double mesAnterior;

	public String getIdentificacion() {
		return this.identificacion;
	}

	/**
	 * 
	 * @param identificacion
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public double getMesActual() {
		return mesActual;
	}

	/**
	 * 
	 * @param mesActual
	 */
	public void setMesActual(double mesActual) {
		this.mesActual = mesActual;
	}

	public double getMesAnterior() {
		return this.mesAnterior;
	}

	/**
	 * 
	 * @param mesAnterior
	 */
	public void setMesAnterior(double mesAnterior) {
		this.mesAnterior = mesAnterior;
	}

	@Override
	public String toString() {
		return "Medidor:" +
				"\n  identificacion='" + identificacion +
				"\n  mesActual=" + mesActual +
				"\n  mesAnterior=" + mesAnterior ;
	}
}
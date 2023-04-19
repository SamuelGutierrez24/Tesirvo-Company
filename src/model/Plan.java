package model;

import java.util.Date;

public class Plan {

	private String nombre;
	private double valorAPagar;
	private double valorConsumoAdicional;
	private Date fechaInicial;
	private Date fechaFinal;

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public double getValorAPagar() {
		return valorAPagar;
	}

	public double getValorConsumoAdicional() {
		return valorConsumoAdicional;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nFecha inicial: " + fechaInicial + "\nFecha final: " + fechaFinal + "\nValor a pagar: " + valorAPagar + "\nValor consumo adicional: "  + valorConsumoAdicional;
	}
}
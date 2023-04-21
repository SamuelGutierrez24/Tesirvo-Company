package model;

import java.util.*;

public class Plan implements Iterable<ServicioDePlan>{

	private String nombre;
	private double valorAPagar;
	private double valorConsumoAdicional;
	private Date fechaInicial;
	private Date fechaFinal;
	private ArrayList<ServicioDePlan> servicios;

	public Plan(String nombre, double valorAPagar, double valorConsumoAdicional, Date fechaInicial, Date fechaFinal, ArrayList<ServicioDePlan> servicios){
		this.nombre = nombre;
		this.valorConsumoAdicional = valorConsumoAdicional;
		this.fechaFinal = fechaFinal;
		this.valorAPagar = valorAPagar;
		this.fechaInicial = fechaInicial;
		this.servicios = servicios;
	}

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

	private String serviciosToString(){
		String result = "";
		for(ServicioDePlan c : servicios){
			result += c + "\n";
		}
		return result;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nFecha inicial: " + fechaInicial + "\nFecha final: " + fechaFinal + "\nValor a pagar: " + valorAPagar + "\nValor consumo adicional: "  + valorConsumoAdicional + "\nServicios: \n" + serviciosToString();
	}

	@Override
	public Iterator<ServicioDePlan> iterator() {
		return servicios.iterator();
	}
	
	public int numServicios(){
		return servicios.size();
	}
}
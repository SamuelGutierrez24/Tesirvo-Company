package model;

public class Caracteristica {

	private String nombre;
	private String valor;

	public Caracteristica(String nombre, String valor){
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public String getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "  -Nombre: " + nombre + "\n   Valor: " + valor;
	}
}
package model;

public class TelefoniaFinita extends Telefonia {

	public TelefoniaFinita(int minutosLocales, int minutoslargaDist, String contrato){
		super(contrato);
		this.minutoslargaDist = minutoslargaDist;
		this.minutosLocales = minutosLocales;
	}

	private int minutosLocales;
	private int minutoslargaDist;

	@Override
	public String toString() {
		return super.toString() + "\nMinutos locales disponibles: " + minutosLocales + "\nMinutos a larga distancia disponibles: " + minutoslargaDist;
	}
}
package model;

import java.util.*;

public class TelefoniaFinita extends Telefonia {

	public TelefoniaFinita(int minutosLocales, int minutoslargaDist, String contrato, String id, String dir, Date fechaInstall, Date fechaFact){
		super(contrato,id,dir,fechaInstall,fechaFact);
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
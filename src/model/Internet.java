package model;

import java.util.*;

public class Internet extends Servicio {

	private int megas;
	private int megasConsumidas;
	private TipoDeContrato contrato;

	public Internet(int megas, String contrato, String id, String dir, Date fechaInstall, Date fechaFact)throws NoSuchElementException{

		super(id,dir,fechaInstall,fechaFact);

		switch (contrato){
			case "PREPAGO":
				this.contrato = TipoDeContrato.PREPAGO;
				break;
			case "LIMITADO":
				this.contrato = TipoDeContrato.LIMITADO;
				break;
			case "ILIMITADO":
				this.contrato = TipoDeContrato.ILIMITADO;
				break;
			default: throw new NoSuchElementException("The type " + contrato + " does not exist.");
		}

		this.megas = megas;
	}

	@Override
	public String toString() {
		return "Servicio de Interet " + contrato + "\n" + super.toString() + (contrato!=TipoDeContrato.ILIMITADO?"\nMegas: " + megas : "") + "\nMegas consumidas: " + megasConsumidas;
	}
}
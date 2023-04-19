package model;

import java.util.NoSuchElementException;

public class Telefonia extends Servicio {

	private int consumLocal;
	private int consumDist;

	private TipoDeContrato contrato;

	public Telefonia(String contrato) throws NoSuchElementException {
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
	}

	@Override
	public String toString() {
		return "Servicio de Telefonia " + contrato + "\n" + super.toString() + "\nConsumo de minutos locales: " + consumLocal + "\nConsumo de minutos de larga distancia: " + consumDist;
	}
}
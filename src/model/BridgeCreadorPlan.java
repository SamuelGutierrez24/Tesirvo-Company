package model;

import java.util.ArrayList;

public class BridgeCreadorPlan {

	private static BridgeCreadorPlan instance;

	public static BridgeCreadorPlan getInstance() {
		return instance;
	}

	private BridgeCreadorPlan(){}

	/**
	 * 
	 * @param plan
	 */
	public Servicio[] crearServiciosBasadoEnPlan(Plan plan) {
		Servicio[] servicios = new Servicio[plan.numServicios()];

		int num = 0;

		for(ServicioDePlan s : plan){
			switch (s.getTipo()){
				case AGUA ->{
					try {
						servicios[num] = FactoryService.getInstance().crearServicioBasico(1, null, null, null, null, null);
						servicios[num].setEstadoServicio("INACTIVO");
					}
					catch (Exception e) {}
				}
				case GAS -> {
					try {
						servicios[num] = FactoryService.getInstance().crearServicioBasico(3, null, null, null, null, null);
						servicios[num].setEstadoServicio("INACTIVO");
					}
					catch (Exception e) {}
				}
				case ENERGIA ->{
					try {
						servicios[num] = FactoryService.getInstance().crearServicioBasico(2, null, null, null, null, null);
						servicios[num].setEstadoServicio("INACTIVO");
					}
					catch (Exception e) {}
				}
				case TELEFONIA_ILIM ->{
					try {
						servicios[num] = FactoryService.getInstance().crearServicioTelefonico("ILIMITADO",0, 0, null, null, null, null);
						servicios[num].setEstadoServicio("INACTIVO");
					}
					catch (Exception e) {}
				}
				case TELEFONIA_LIM -> {
					try {
						servicios[num] = FactoryService.getInstance().crearServicioTelefonico("LIMITADO",0, 0, null, null, null, null);
						servicios[num].setEstadoServicio("INACTIVO");
					}
					catch (Exception e) {}
				}
				case TELEFONIA_PRE -> {
					try {
						servicios[num] = FactoryService.getInstance().crearServicioTelefonico("PREPAGO",0, 0, null, null, null, null);
						servicios[num].setEstadoServicio("INACTIVO");
					}
					catch (Exception e) {}
				}
				case INTERNET_LIM -> {
					try {
						servicios[num] = FactoryService.getInstance().crearServicioInternet(0,"LIMITADO",null, null, null, null);
						servicios[num].setEstadoServicio("INACTIVO");
					}
					catch (Exception e) {}
				}
				case INTERNET_PRE -> {
					try {
						servicios[num] = FactoryService.getInstance().crearServicioInternet(0,"PREPAGO",null, null, null, null);
						servicios[num].setEstadoServicio("INACTIVO");
					}
					catch (Exception e) {}
				}
				case INTERNET_ILIM -> {
					try {
						servicios[num] = FactoryService.getInstance().crearServicioInternet(0,"ILIMITADO",null, null, null, null);
						servicios[num].setEstadoServicio("INACTIVO");
					}
					catch (Exception e) {}
				}
			}
		}
		return null;
	}

}
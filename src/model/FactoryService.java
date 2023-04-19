package model;

import java.util.Date;

public class FactoryService {

	public Servicio crearServicioTelefonico(boolean finita, String contract, int localMin, int largeMin) {

		if(finita == true){
			return new TelefoniaFinita(localMin,largeMin,contract);
		}else{
			return new Telefonia(contract);
		}
	}

	public Servicio crearServicioInternet(int capacityMe,String contract ){
		return new Internet(capacityMe,contract);
	}

	public Servicio CrearServicioBasico(int type, String idMedidor, String id, String dir, Date fechaInstall, Date fechaFact) throws Exception {

		switch (type){
			case 1: return new Agua(new Medidor(idMedidor),id,dir,fechaInstall,fechaFact);

			case 2: return new Energia(new Medidor(idMedidor),id,dir,fechaInstall,fechaFact);

			case 3: return new Gas(new Medidor(idMedidor),id,dir,fechaInstall,fechaFact);

			default: throw new Exception("That is not a basic service");


		}
	}

}
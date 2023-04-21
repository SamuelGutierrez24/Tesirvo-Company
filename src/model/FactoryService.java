package model;

import java.util.Date;

public class FactoryService {

	private static FactoryService instance = new FactoryService() ;

	public static FactoryService getInstance() {
		return instance;
	}

	private FactoryService(){}

	public Servicio crearServicioTelefonico(String contract, int localMin, int largeMin, String id, String dir, Date fechaInstall, Date fechaFact) {

		if(!contract.equals(TipoDeContrato.ILIMITADO + "")){
			return new TelefoniaFinita(localMin,largeMin,contract,id,dir,fechaInstall,fechaFact);
		}else{
			return new Telefonia(contract,id,dir,fechaInstall,fechaFact);
		}
	}

	public Servicio crearServicioInternet(int capacityMe, String contract, String id, String dir, Date fechaInstall, Date fechaFact){
		return new Internet(capacityMe,contract,id,dir,fechaInstall,fechaFact);
	}

	public Servicio crearServicioBasico(int type, String idMedidor, String id, String dir, Date fechaInstall, Date fechaFact) throws Exception {

		switch (type){
			case 1: return new Agua(new Medidor(idMedidor),id,dir,fechaInstall,fechaFact);

			case 2: return new Energia(new Medidor(idMedidor),id,dir,fechaInstall,fechaFact);

			case 3: return new Gas(new Medidor(idMedidor),id,dir,fechaInstall,fechaFact);

			default: throw new Exception("That is not a basic service");


		}
	}

}
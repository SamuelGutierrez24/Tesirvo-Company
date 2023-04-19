package model;

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

	public Servicio CrearServicioBasico(int type) throws Exception {

		switch (type){
			case 1: return new Agua();

			case 2: return new Energia();

			case 3: return new Gas();

			default: throw new Exception("That is not a basic service");


		}
	}

}
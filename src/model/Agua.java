package model;

import java.util.Date;

public class Agua extends ServicioBasico {

    @Override
    public String toString() {
        return "Servicio de Agua\n\n" + super.toString();
    }

    public Agua(Medidor medidor, String id, String dir, Date fechaInstall, Date fechaFact){
        super(medidor,id,dir,fechaInstall,fechaFact);
    }

}
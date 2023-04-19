package model;

import java.util.Date;

public class Gas extends ServicioBasico {

    @Override
    public String toString() {
        return "Servicio de Gas\n\n" + super.toString();
    }

    public Gas(Medidor medidor, String id, String dir, Date fechaInstall, Date fechaFact){
        super(medidor,id,dir,fechaInstall,fechaFact);
    }

}
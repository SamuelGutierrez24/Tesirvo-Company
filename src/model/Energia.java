package model;

import java.util.Date;

public class Energia extends ServicioBasico {

    @Override
    public String toString() {
        return "Servicio de Energia\n\n" + super.toString();
    }

    public Energia(Medidor medidor, String id, String dir, Date fechaInstall, Date fechaFact){
        super(medidor,id,dir,fechaInstall,fechaFact);
    }

}
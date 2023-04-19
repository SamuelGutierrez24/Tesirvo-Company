package model;

import java.util.*;

public abstract class ServicioBasico extends Servicio {


    private Medidor medidor;

    public Medidor getMedidor() {
        return medidor;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + medidor;
    }

    public ServicioBasico(Medidor medidor, String id, String dir, Date fechaInstall, Date fechaFact){
        super(id,dir,fechaInstall,fechaFact);
        this.medidor = medidor;
    }
}
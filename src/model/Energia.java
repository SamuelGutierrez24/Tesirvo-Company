package model;

public class Energia extends ServicioBasico {

    @Override
    public String toString() {
        return "Servicio de Energia\n\n" + super.toString();
    }

    public Energia(Medidor medidor){
        super(medidor);
    }

}
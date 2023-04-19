package model;

public class Agua extends ServicioBasico {

    @Override
    public String toString() {
        return "Servicio de Agua\n\n" + super.toString();
    }

    public Agua(Medidor medidor){
        super(medidor);
    }

}
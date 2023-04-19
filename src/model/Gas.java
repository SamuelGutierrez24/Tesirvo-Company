package model;

public class Gas extends ServicioBasico {

    @Override
    public String toString() {
        return "Servicio de Gas\n\n" + super.toString();
    }

    public Gas(Medidor medidor){
        super(medidor);
    }

}
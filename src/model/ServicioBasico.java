package model;

public abstract class ServicioBasico extends Servicio {


    private Medidor medidor = new Medidor();

    public Medidor getMedidor() {
        return medidor;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + medidor;
    }

    public ServicioBasico(Medidor medidor){
        this.medidor = medidor;
    }
}
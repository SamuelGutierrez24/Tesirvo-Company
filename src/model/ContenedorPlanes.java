package model;

import java.util.ArrayList;
import java.util.Date;

public class ContenedorPlanes {
    private ArrayList<Plan> planes;

    public ContenedorPlanes() {
        this.planes = new ArrayList<Plan>();
    }

    public void crearPlan(String nombre, double valorAPagar, double valorConsumoAdicional, Date fechaInicial, Date fechaFinal, ArrayList<ServicioDePlan> servicios){
        planes.add(new Plan(nombre, valorAPagar, valorConsumoAdicional, fechaInicial, fechaFinal, servicios));
    }
}
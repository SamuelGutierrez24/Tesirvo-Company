package model;

import java.util.ArrayList;
import java.util.Iterator;

public class ServicioDePlan implements Iterable<Caracteristica>{

    private TiposServicos tipo;

    private ArrayList<Caracteristica> caracteristicas = new ArrayList<>();

    public ServicioDePlan(TiposServicos tipo, ArrayList<Caracteristica> caracteristicas){
        this.caracteristicas = caracteristicas;
        this.tipo = tipo;
    }

    @Override
    public Iterator<Caracteristica> iterator() {
        return caracteristicas.iterator();
    }

    public TiposServicos getTipo() {
        return tipo;
    }

    public String caracteristicasToString(){
        String result= "";
        for (Caracteristica c : caracteristicas){
            result += c;
        }
        return result;
    }

    @Override
    public String toString() {
        return "\n" + tipo + "\n Caracteristicas: " + caracteristicasToString();
    }
}
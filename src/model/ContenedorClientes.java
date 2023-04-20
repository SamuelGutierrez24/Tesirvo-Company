package model;

import java.util.ArrayList;
import java.util.Date;

public class ContenedorClientes {

    public ContenedorClientes() {
        this.clientes = new ArrayList<>();
    }

    private ArrayList<Cliente> clientes;
    public void anadirCliente(String nombre, String id, Date fechaDeRegistro, String codigoDeContrato, String direccionDeFacturacion, String telefono, String email, String estado) {
        Estado newEstado;
        if (estado.equals("POTENCIAL")) newEstado = Estado.POTENCIAL;
        else if (estado.equals("PAZ_Y_SALVO")) newEstado = Estado.PAZ_Y_SALVO;
        else if (estado.equals("MOROSO")) newEstado = Estado.MOROSO;
        else if (estado.equals("RETIRADO")) newEstado = Estado.RETIRADO;
        else if (estado.equals("CARTERA_CASTIGADA")) newEstado = Estado.CARTERA_CASTIGADA;
        else newEstado = null;
        clientes.add(new Cliente(nombre, id, fechaDeRegistro, codigoDeContrato, direccionDeFacturacion, telefono, email, newEstado));
    }

    public void crearPaquete(String idCliente, String idPaquete){
        for (Cliente cliente: clientes) {
            if (cliente.equals(idCliente)){
                cliente.getPaquetes().add(new PaqueteDeServicios(idPaquete));
            }
        }
    }

    public void crearServicioCliente(String idCliente, String idPaquete, String idServicio, String tipoServicio, String direccionInstalacion, String fechaInstalacion, String fechaFacturacion, ArrayList<String> parametrosParticulares){
        for (Cliente cliente: clientes) {
            if (cliente.getId().equals(idCliente)){
               cliente.crearServicio(idPaquete, idServicio, tipoServicio,  direccionInstalacion, fechaInstalacion, fechaFacturacion, parametrosParticulares);
            }
        }
    }
}

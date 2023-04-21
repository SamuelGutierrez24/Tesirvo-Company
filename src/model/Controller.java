package model;

import java.text.SimpleDateFormat;
import java.util.*;

public class Controller implements Iterable<Cliente>{
	private static Controller instance = new Controller();
	private ContenedorClientes contenedorClientes;
	private ContenedorPlanes contenedorPlanes;


	private Controller() {
		contenedorClientes = new ContenedorClientes();
		contenedorPlanes = new ContenedorPlanes();

	}
	/**
	 * 
	 * @param nombre
	 * @param id
	 * @param fecha
	 * @param codigoDeContrato
	 * @param direccion
	 * @param telefono
	 * @param email
	 * @param estado
	 */
	public void crearCliente(String nombre, String id, String fecha, String codigoDeContrato, String direccion, String telefono, String email, String estado) {
		// formato dd/MM/yyyy
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = dateFormat.parse(fecha);
			contenedorClientes.anadirCliente(nombre, id, date, codigoDeContrato, direccion, telefono, email, estado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void inactivarServicio(String idCliente, String idPaquete, String idServicio) {
		contenedorClientes.inactivarServicio(idCliente, idPaquete, idServicio);
	}

	public void crearPaquete(String idCliente, String idPaquete){
		contenedorClientes.crearPaquete(idCliente, idPaquete);
	}

	public void crearServicio(String idCliente, String idPaquete, String idServicio, String tipoServicio, String direccionInstalacion, String fechaInstalacion, String fechaFacturacion, ArrayList<String> parametrosParticulares) {
		contenedorClientes.crearServicioCliente( idCliente, idPaquete, idServicio, tipoServicio,  direccionInstalacion,  fechaInstalacion,  fechaFacturacion, parametrosParticulares);
	}

	/**
	 * @param idCliente
	 * @param idServicio
	 * @param dirServicio
	 * @param estServicio
	 * @param idMedidior
	 */
	/*public boolean actualizarServicio(String idCliente, String idServicio, String dirServicio, String estServicio, String idMedidior) {
		contenedorClientes.actualizarServicio();
	}*/

	/**
	 * 
	 * @param idCliente
	 */
	public ArrayList<Servicio> consultarServicos(String idCliente) {
		return contenedorClientes.consultarServiciosCliente(idCliente);
	}

	/**
	 * 
	 * @param idCliente
	 * @param idServicio
	 * @param nuevoValor
	 */
	public boolean actualizarValoresContador(String idCliente, String idServicio, double nuevoValor) {
		Cliente client = contenedorClientes.buscarCliente(idCliente);
		if(client != null){

			Servicio service = client.searchService(idServicio);
			if (service != null && service instanceof ServicioBasico){
				double mesPasado = ((ServicioBasico) service).getMedidor().getMesActual();
				((ServicioBasico) service).getMedidor().setMesActual(nuevoValor);
				((ServicioBasico) service).getMedidor().setMesAnterior(mesPasado);
			}else {
				return false;
			}
			return true;
		}else {
			return false;
		}
	}

	public void crearPlanes(String nombre, double valorAPagar, double valorConsumoAdicional, Date fechaInicial, Date fechaFinal, ArrayList<ServicioDePlan> servicios){
		contenedorPlanes.crearPlan(nombre, valorAPagar, valorConsumoAdicional,  fechaInicial, fechaFinal, servicios);
	}

	public static Controller getInstance() {
		return instance;
	}

	public Iterator<Cliente> iterator() {
		return contenedorClientes.iterator();
	}

	public ContenedorClientes getContenedorClientes(){
		return contenedorClientes;
	}

	public void addService2Pack(String id, Servicio servicio, String idclient)throws Exception{
		Cliente client = contenedorClientes.buscarCliente(idclient);
		client.getPaquete(id).anadirServicios(servicio);
	}


}
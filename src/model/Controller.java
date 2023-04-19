package model;

import java.util.*;

public class Controller {

	ContenedorClientes Clientes;

	private Controller() {
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
	public void crearCliente(String nombre, String id, Date fecha, String codigoDeContrato, String direccion, String telefono, String email, String estado) {
		// TODO - implement Controller.crearCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCliente
	 * @param idServicio
	 * @param dirServicio
	 * @param estServicio
	 * @param idMedidior
	 */
	public void crearServicio(String idCliente, String idServicio, String dirServicio, String estServicio, String idMedidior) {
		// TODO - implement Controller.crearServicio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCliente
	 * @param idServicio
	 * @param dirServicio
	 * @param estServicio
	 * @param idMedidior
	 */
	public boolean actualizarServicio(String idCliente, String idServicio, String dirServicio, String estServicio, String idMedidior) {
		// TODO - implement Controller.actualizarServicio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCliente
	 * @param idServicio
	 */
	public boolean inactivarServicio(String idCliente, String idServicio) {
		// TODO - implement Controller.inactivarServicio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCliente
	 */
	public Servicio[] consultarServicos(String idCliente) {
		// TODO - implement Controller.consultarServicos
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCliente
	 * @param idServicio
	 * @param nuevoValor
	 */
	public boolean actualizarValoresContador(String idCliente, String idServicio, double nuevoValor) {
		// TODO - implement Controller.actualizarValoresContador
		throw new UnsupportedOperationException();
	}

	public Controller getInstance() {
		// TODO - implement Controller.getInstance
		throw new UnsupportedOperationException();
	}

	public Iterator<Cliente> getIterator() {
		// TODO - implement Controller.getIterator
		throw new UnsupportedOperationException();
	}

}
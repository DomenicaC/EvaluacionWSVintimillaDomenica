package ec.edu.ups.EvaluacionWSVintimillaDomenica.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import ec.edu.ups.EvaluacionWSVintimillaDomenica.bussines.clientesON;
import ec.edu.ups.EvaluacionWSVintimillaDomenica.modelo.cliente;


public class clienteBEAN {

	private cliente newCliente = new cliente();

	private List<cliente> clientes;
	@Inject
	private clientesON onCliente;
	
	@PostConstruct
	public void init() {
		clientes= onCliente.getClientes();
		System.out.println(clientes);
	}
	
	public List<cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<cliente> clientes) {
		this.clientes = clientes;
	}

	
	public cliente getNewCliente() {
		return newCliente;
	}

	public void setNewCliente(cliente newCliente) {
		this.newCliente = newCliente;
	}


	/** Action Controler */
	public String guardarPersona() {

		/*
		 * System.out.println(this.nombre); System.out.println(this.cedula);
		 * System.out.println(this.direccion);
		 */

			onCliente.insertarCliente(newCliente);
		

		return "lista-cliente?faces-redirect=true";
	}
	
}

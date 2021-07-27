package ec.edu.ups.EvaluacionWSVintimillaDomenica.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import ec.edu.ups.EvaluacionWSVintimillaDomenica.bussines.clientesON;
import ec.edu.ups.EvaluacionWSVintimillaDomenica.bussines.creditosON;
import ec.edu.ups.EvaluacionWSVintimillaDomenica.modelo.cliente;
import ec.edu.ups.EvaluacionWSVintimillaDomenica.modelo.credito;


public class creditoBEAN {

	private credito newCredito = new credito();

	private List<credito> creditos;
	@Inject
	private creditosON onCredito;
	
	@PostConstruct
	public void init() {
		creditos= onCredito.getCreditos();
		System.out.println(creditos);
	}
	
	public List<credito> getCreditos() {
		return creditos;
	}

	public void setCreditos(List<credito> creditos) {
		this.creditos = creditos;
	}

	
	public credito getNewCredito() {
		return newCredito;
	}

	public void setNewCredito(credito newCredito) {
		this.newCredito = newCredito;
	}


	/** Action Controler */
	public String guardarCredito() {

		/*
		 * System.out.println(this.nombre); System.out.println(this.cedula);
		 * System.out.println(this.direccion);
		 */

			onCredito.insertarCredito(newCredito);
		

		return "lista-creditos?faces-redirect=true";
	}
	
}

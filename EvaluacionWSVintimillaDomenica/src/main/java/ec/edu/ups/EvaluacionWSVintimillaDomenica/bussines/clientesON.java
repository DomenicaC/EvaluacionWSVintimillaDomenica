package ec.edu.ups.EvaluacionWSVintimillaDomenica.bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.EvaluacionWSVintimillaDomenica.dao.ClienteDAO;
import ec.edu.ups.EvaluacionWSVintimillaDomenica.modelo.cliente;

@Stateless
public class clientesON {

	
	@Inject 
	private ClienteDAO daoCliente;
	
	public void insertarCliente(cliente cliente) {
		daoCliente.insert(cliente);
	}
	
	public List<cliente> getClientes(){
		return daoCliente.getCliente("%");
	}
}

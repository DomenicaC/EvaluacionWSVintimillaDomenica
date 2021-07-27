package ec.edu.ups.EvaluacionWSVintimillaDomenica.bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.EvaluacionWSVintimillaDomenica.dao.ClienteDAO;
import ec.edu.ups.EvaluacionWSVintimillaDomenica.dao.CreditoDAO;
import ec.edu.ups.EvaluacionWSVintimillaDomenica.modelo.cliente;
import ec.edu.ups.EvaluacionWSVintimillaDomenica.modelo.credito;


@Stateless
public class creditosON {

	@Inject 
	private CreditoDAO daoCredito;
	
	@Inject 
	private ClienteDAO daoCliente;
	
	public void insertarCredito(credito credito) {
		cliente c = daoCliente.read(credito.getCliente().getCedula());
		if (c == null) {
			System.out.println("Cliente no existe");
		}else {
			daoCredito.insert(credito);
		}
		
	}
	
	public List<credito> getCreditos(){
		return daoCredito.getCredito();
	}
	
}

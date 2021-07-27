package ec.edu.ups.EvaluacionWSVintimillaDomenica.service;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.EvaluacionWSVintimillaDomenica.bussines.creditosON;
import ec.edu.ups.EvaluacionWSVintimillaDomenica.modelo.credito;

@WebService
public class SoliCredito {

	@Inject
	private creditosON onCreditos;
	
	@WebMethod
	public String solicitudCred(credito credito) {
		onCreditos.insertarCredito(credito);
		return "OK";
	}
	
	@WebMethod
	public int sumar(int a, int b) {
		return a + b;
	}
}

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
		try {
			onCreditos.insertarCredito(credito);
			return "Credito autorizado";
		} catch (Exception e) {
			// TODO: handle exception
			return "Lo siento no se puede hacer la solicitud";
		}

	}
	
}

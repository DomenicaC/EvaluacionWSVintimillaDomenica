package ec.edu.ups.EvaluacionWSVintimillaDomenica.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class cliente {

	@Id
	private String cedula;
	private String nombres;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

}

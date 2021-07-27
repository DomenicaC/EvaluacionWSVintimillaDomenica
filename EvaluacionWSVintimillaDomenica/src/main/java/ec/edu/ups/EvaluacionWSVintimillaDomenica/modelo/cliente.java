package ec.edu.ups.EvaluacionWSVintimillaDomenica.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class cliente {

	@Id
	private String cedula;
	private String nombres;
	private String numCuenta;
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<credito> cred;

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

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public List<credito> getCred() {
		return cred;
	}

	public void setCred(List<credito> cred) {
		this.cred = cred;
	}

}

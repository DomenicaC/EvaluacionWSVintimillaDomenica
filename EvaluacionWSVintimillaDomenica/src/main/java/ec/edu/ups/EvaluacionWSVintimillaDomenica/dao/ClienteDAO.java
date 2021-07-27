package ec.edu.ups.EvaluacionWSVintimillaDomenica.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.EvaluacionWSVintimillaDomenica.modelo.cliente;

@Stateless
public class ClienteDAO {

	@PersistenceContext
	private EntityManager em;

	public void insert(cliente cliente) {
		em.persist(cliente);
	}

	public void update(cliente cliente) {
		em.merge(cliente);
	}

	public cliente read(String cedula) {
		cliente c = em.find(cliente.class, cedula);
		return c;
	}

	public List<cliente> getCliente(String nombre) {
		String jpq2 = "SELECT c FROM credito c " + "WHERE nombre LIKE ?1 ";

		Query query = em.createQuery(jpq2, cliente.class);

		List<cliente> clientes = query.getResultList();
		return clientes;
	}
}

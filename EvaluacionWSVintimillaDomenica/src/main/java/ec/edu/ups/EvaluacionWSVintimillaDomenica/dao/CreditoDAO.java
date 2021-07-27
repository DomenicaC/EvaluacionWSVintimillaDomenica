package ec.edu.ups.EvaluacionWSVintimillaDomenica.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.EvaluacionWSVintimillaDomenica.modelo.credito;

@Stateless
public class CreditoDAO {

	@PersistenceContext
	private EntityManager em;

	public void insert(credito credito) {
		em.persist(credito);
	}

	public void update(credito credito) {
		em.merge(credito);
	}

	public credito read(int codigo) {
		credito c = em.find(credito.class, codigo);
		return c;
	}

	public List<credito> getCredito(int codigo) {
		String jpq2 = "SELECT c FROM credito c ";

		
		Query query = em.createQuery(jpq2, credito.class);
		

		List<credito> creditos = query.getResultList();
		return creditos;
	}
}

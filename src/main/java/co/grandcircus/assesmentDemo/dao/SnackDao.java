package co.grandcircus.assesmentDemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.assesmentDemo.entity.Snack;

@Transactional
@Repository
public class SnackDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Snack> findAll() {
		return em.createQuery("FROM Snack", Snack.class)
				.getResultList();
	}
	
	public void addSnack(Snack snack) {
		em.persist(snack);
	}

}

package ClassesDAO;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ClassesBasicas.Jogo;

public class JogoJpaDAO {
	private static JogoJpaDAO instance;
	protected EntityManager entityManager;
	public static JogoJpaDAO getInstance() {
		if (instance == null) {
			instance = new JogoJpaDAO();
		}
		return instance;
	}

	private JogoJpaDAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jogo");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public Jogo getById(final int id) {
		return entityManager.find(Jogo.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Jogo> findAll() {
		return entityManager.createQuery("FROM " + Jogo.class.getName()).getResultList();
	}

	public void persist(Jogo jogo) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(jogo);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void merge(Jogo jogo) {
		try {
			entityManager.getTransaction().begin();
			jogo = entityManager.merge(jogo);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void remove(Jogo jogo) {
		try {
			entityManager.getTransaction().begin();
			entityManager.remove(jogo);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void removeById(final int id) {
		try {
			Jogo jogo = getById(id);
			remove(jogo);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

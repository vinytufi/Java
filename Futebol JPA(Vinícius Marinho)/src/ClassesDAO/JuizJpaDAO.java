package ClassesDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ClassesBasicas.Juiz;

public class JuizJpaDAO {
	private static JuizJpaDAO instance;
	protected EntityManager entityManager;

	public static JuizJpaDAO getInstance() {
		if (instance == null) {
			instance = new JuizJpaDAO();
		}
		return instance;
	}

	private JuizJpaDAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jogo");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public Juiz getById(final int id) {
		return entityManager.find(Juiz.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Juiz> findAll() {
		return entityManager.createQuery("FROM " + Juiz.class.getName()).getResultList();
	}

	public void persist(Juiz juiz) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(juiz);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void merge(Juiz juiz) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(juiz);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void remove(Juiz juiz) {
		try {
			entityManager.getTransaction().begin();
			juiz = entityManager.find(Juiz.class, juiz.getId());
			entityManager.remove(juiz);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void removeById(final int id) {
		try {
			Juiz juiz = getById(id);
			remove(juiz);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

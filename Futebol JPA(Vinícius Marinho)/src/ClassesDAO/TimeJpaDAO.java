package ClassesDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ClassesBasicas.Time;

public class TimeJpaDAO {
	private static TimeJpaDAO instance;
	protected EntityManager entityManager;

	public static TimeJpaDAO getInstance() {
		if (instance == null) {
			instance = new TimeJpaDAO();
		}
		return instance;
	}

	private TimeJpaDAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jogo");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public Time getById(final int id) {
		return entityManager.find(Time.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Time> findAll() {
		return entityManager.createQuery("FROM " + Time.class.getName()).getResultList();
	}

	public void persist(Time time) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(time);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void merge(Time time) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(time);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void remove(Time time) {
		try {
			entityManager.getTransaction().begin();
			time = entityManager.find(Time.class, time.getId());
			entityManager.remove(time);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void removeById(final int id) {
		try {
			Time time = getById(id);
			remove(time);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

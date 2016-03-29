package ClassesDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ClassesBasicas.Tecnico;

public class TecnicoJpaDAO {
	private static TecnicoJpaDAO instance;
	protected EntityManager entityManager;

	public static TecnicoJpaDAO getInstance() {
		if (instance == null) {
			instance = new TecnicoJpaDAO();
		}
		return instance;
	}

	private TecnicoJpaDAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jogo");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public Tecnico getById(final int id) {
		return entityManager.find(Tecnico.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Tecnico> findAll() {
		return entityManager.createQuery("FROM " + Tecnico.class.getName()).getResultList();
	}

	public void persist(Tecnico tecnico) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(tecnico);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void merge(Tecnico tecnico) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(tecnico);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void remove(Tecnico tecnico) {
		try {
			entityManager.getTransaction().begin();
			tecnico = entityManager.find(Tecnico.class, tecnico.getId());
			entityManager.remove(tecnico);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void removeById(final int id) {
		try {
			Tecnico tecnico = getById(id);
			remove(tecnico);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

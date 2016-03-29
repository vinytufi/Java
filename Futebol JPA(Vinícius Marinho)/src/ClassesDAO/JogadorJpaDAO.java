package ClassesDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ClassesBasicas.Jogador;

public class JogadorJpaDAO {
	private static JogadorJpaDAO instance;
	protected EntityManager entityManager;

	public static JogadorJpaDAO getInstance() {
		if (instance == null) {
			instance = new JogadorJpaDAO();
		}
		return instance;
	}

	private JogadorJpaDAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jogo");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public Jogador getById(final int id) {
		return entityManager.find(Jogador.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Jogador> findAll() {
		return entityManager.createQuery("FROM " + Jogador.class.getName()).getResultList();
	}

	public void persist(Jogador jogador) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(jogador);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void merge(Jogador jogador) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(jogador);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void remove(Jogador jogador) {
		try {
			entityManager.getTransaction().begin();
			jogador = entityManager.find(Jogador.class, jogador.getId());
			entityManager.remove(jogador);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void removeById(final int id) {
		try {
			Jogador jogador = getById(id);
			remove(jogador);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

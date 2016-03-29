package Dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ClassesBasicas.Jogo;

public class FutebolDadosAlteracao {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jogo");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Jogo original = em.find(Jogo.class, 4);
		System.out.println(original.getId());
		em.getTransaction().commit();
		em.close();
		emf.close();

	}
}

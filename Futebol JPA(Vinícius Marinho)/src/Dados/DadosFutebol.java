package Dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ClassesBasicas.Jogador;
import ClassesBasicas.Jogo;
import ClassesBasicas.Juiz;
import ClassesBasicas.Tecnico;
import ClassesBasicas.Time;

public class DadosFutebol {
	public static void main(String[] args) {

		Tecnico tec1 = new Tecnico(1, "Paulo Autuori", "10/03/1958", 102000);

		Tecnico tec2 = new Tecnico(2, "Mano Menezes", "21/04/1957", 90000);

		Tecnico tec3 = new Tecnico(3, "Marcelo Oliveira", "10/03/1958", 82500);

		Time tim1 = new Time(1, "São Paulo", "SP", 15, tec1);

		Time tim2 = new Time(2, "Cruzeiro", "MG", 32, tec3);

		Time tim3 = new Time(3, "Flamengo", "RJ", 30, tec3);

		Jogador jogador1 = new Jogador(1, "Rogério Ceni", tim1, "28/10/1979", 88000, 01, "Sim", "Não", 2, 1);

		Jogador jogador2 = new Jogador(2, "Alex Silva", tim1, "04/01/1983", 45000, 02, "Sim", "Não", 2, 1);

		Jogador jogador3 = new Jogador(3, "Fabão", tim2, "22/11/1982", 52500, 03, "Sim", "Não", 3, 0);

		Jogador jogador4 = new Jogador(4, "Edcarlos", tim2, "16/05/1984", 70000, 04, "Não", "Não", 1, 0);

		Jogador jogador5 = new Jogador(5, "Souza", tim1, "27/09/1980", 65000, 15, "Sim", "Sim", 1, 1);

		Jogador jogador6 = new Jogador(6, "Ilsinho", tim1, "25/11/1984", 438609 / 10, 06, "Não", "Não", 2, 0);

		Juiz jui1 = new Juiz(1, "Armando Marques", "06/02/1930", 24000);

		Juiz jui2 = new Juiz(2, "Paulo Cesar de Oliveira", "16/12/1973", 35000);

		Jogo jogo1 = new Jogo();
		jogo1.setId(1);
		jogo1.setTimecasa(tim1);
		jogo1.setTimevisitante(tim2);
		jogo1.setPlacar1(2);
		jogo1.setPlacar2(1);
		jogo1.setDataDoJogo("13/07/2013");
		jogo1.setJuiz(jui2);

		Jogo jogo2 = new Jogo();
		jogo2.setId(2);
		jogo2.setTimecasa(tim2);
		jogo2.setTimevisitante(tim1);
		jogo2.setPlacar1(0);
		jogo2.setPlacar2(0);
		jogo2.setDataDoJogo("10/10/2013");
		jogo2.setJuiz(jui1);
		Jogo jogo3 = new Jogo();
		jogo3.setId(3);
		jogo3.setTimecasa(tim3);
		jogo3.setTimevisitante(tim2);
		jogo3.setPlacar1(1);
		jogo3.setPlacar2(1);
		jogo3.setDataDoJogo("14/08/2013");
		jogo3.setJuiz(jui2);
		Jogo jogo4 = new Jogo();
		jogo4.setId(4);
		jogo4.setTimecasa(tim1);
		jogo4.setTimevisitante(tim3);
		jogo4.setPlacar1(0);
		jogo4.setPlacar2(0);
		jogo4.setDataDoJogo("19/09/2013");
		jogo4.setJuiz(jui1);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jogo");
		EntityManager em  = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(jui1);
		em.persist(jui2);
		em.persist(tec1);
		em.persist(tec2);
		em.persist(tec3);
		em.persist(tim1);
		em.persist(tim2);
		em.persist(tim3);
		em.persist(jogador1);
		em.persist(jogador2);
		em.persist(jogador3);
		em.persist(jogador4);
		em.persist(jogador5);
		em.persist(jogador6);
		em.persist(jogo1);
		em.persist(jogo2);
		em.persist(jogo3);
		em.persist(jogo4);
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("Cadastrados");
	}
}

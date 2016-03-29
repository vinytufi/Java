package ClassesBasicas;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Time {
	public Time(int id, String nome, String estado, int pontos, Tecnico tecnico) {
		this.id = id;
		this.nome = nome;
		this.estado = estado;
		this.pontos = pontos;
		this.tecnico = tecnico;
	}
public Time() {
	// TODO Auto-generated constructor stub
}
	@Id
	@Column(name = "time_id")
	private int id;
	private String nome;
	private String estado;
	private int pontos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	@OneToMany(mappedBy = "time", targetEntity = Jogador.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Jogador> jogadores;
	@OneToOne
	@JoinColumn(name = "tecnico_id")
	private Tecnico tecnico;
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "timecasa", optional = true)
	private Jogo jogo;
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "timevisitante", optional = true)
	private Jogo j;
}

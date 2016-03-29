package ClassesBasicas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Jogador {

	public Jogador(int id, String nome, Time time, String dataNascimento, float salario, int noCamisa,
			String estaEmCampo, String temAmareloNoJogo, int qtdCartoesAmarelos, int qtdCartoesVermelhos) {
		this.id = id;
		this.nome = nome;
		this.time = time;
		this.dataDeNascimento = dataNascimento;
		this.salario = salario;
		this.numeroDaCamisa = noCamisa;
		this.estaEmCampo = estaEmCampo;
		this.possuiAmareloNoJogo = temAmareloNoJogo;
		this.qtdCartoesAmarelo = qtdCartoesAmarelos;
		this.qtdCartoesVermelho = qtdCartoesVermelhos;

	}
public Jogador() {
	// TODO Auto-generated constructor stub
}
	@Id
	@Column(name = "jogador_id")
	private int id;
	private String nome;
	private String dataDeNascimento;
	private float salario;
	private int numeroDaCamisa;

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

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getNumeroDaCamisa() {
		return numeroDaCamisa;
	}

	public void setNumeroDaCamisa(int numeroDaCamisa) {
		this.numeroDaCamisa = numeroDaCamisa;
	}

	public String getEstaEmCampo() {
		return estaEmCampo;
	}

	public void setEstaEmCampo(String estaEmCampo) {
		this.estaEmCampo = estaEmCampo;
	}

	public String getPossuiAmareloNoJogo() {
		return possuiAmareloNoJogo;
	}

	public void setPossuiAmareloNoJogo(String possuiAmareloNoJogo) {
		this.possuiAmareloNoJogo = possuiAmareloNoJogo;
	}

	public int getQtdCartoesAmarelo() {
		return qtdCartoesAmarelo;
	}

	public void setQtdCartoesAmarelo(int qtdCartoesAmarelo) {
		this.qtdCartoesAmarelo = qtdCartoesAmarelo;
	}

	public int getQtdCartoesVermelho() {
		return qtdCartoesVermelho;
	}

	public void setQtdCartoesVermelho(int qtdCartoesVermelho) {
		this.qtdCartoesVermelho = qtdCartoesVermelho;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	private String estaEmCampo;
	private String possuiAmareloNoJogo;
	private int qtdCartoesAmarelo;
	private int qtdCartoesVermelho;
	@ManyToOne
	@JoinColumn(name = "time_id")
	private Time time;
}

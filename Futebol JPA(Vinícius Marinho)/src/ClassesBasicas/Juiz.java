package ClassesBasicas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Juiz {
	public Juiz(int id, String nome, String dataNascimento, float salario) {
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataNascimento;
		this.salario = salario;
	}
public Juiz() {
	// TODO Auto-generated constructor stub
}
	@Id
	@Column(name = "juiz_id")
	private int id;
	private String nome;
	private String dataDeNascimento;
	private float salario;

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

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "juiz", optional = true)
	@JoinColumn(name = "jogo_id")
	private Jogo jogo;
}

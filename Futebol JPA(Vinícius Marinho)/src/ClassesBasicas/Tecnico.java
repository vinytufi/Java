package ClassesBasicas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tecnico {
	public Tecnico(int id, String nome, String dataDeNascimento, float salario) {
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.salario = salario;
	}
public Tecnico() {
	// TODO Auto-generated constructor stub
}
	@Id
	@Column(name = "tecnico_id")
	private int id;
	private String nome;
	private String dataDeNascimento;

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

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	float salario;
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "tecnico", optional = true)
	private Time time;

}

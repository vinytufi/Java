package Classes;

import java.util.ArrayList;

public class Casa {
	private ArrayList<String> comodos = new ArrayList<String> ();
	private Garagem garagem;
	private Proprietario proprietario;
	private Endereco endereco;
	private String murada;
	private int qtdc;
	
	public ArrayList<String> getComodos() {
		return comodos;
	}

	public void setComodos(Comodo comodo) {
		qtdc = qtdc + 1;
		this.comodos.add("\n"+ qtdc + " - " + comodo.toString());
	}

	public Garagem getGaragem() {
		return garagem;
	}

	public void setGaragem(Garagem garagem) {
		this.garagem = garagem;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getMurada() {
		return murada;
	}

	public void setMurada(String murada) {
		this.murada = murada;
	}

	public Casa(String murada, Endereco e, Garagem g, Proprietario p) {
		this.murada = murada;
		this.endereco = e;
		this.garagem = g;
		this.proprietario = p;
	}
	@Override
	public String toString() {
		return "Murada:" + murada + "\nEndereco: " + endereco.toString() + "\nGaragem: " + garagem.toString() +"\n" + proprietario.toString() + "\nCômodos: " + comodos + "\n";
	}
}

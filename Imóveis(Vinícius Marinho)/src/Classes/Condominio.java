package Classes;

import java.util.ArrayList;

public class Condominio {
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPiscina() {
		return piscina;
	}

	public void setPiscina(String piscina) {
		this.piscina = piscina;
	}

	public String getPortaria() {
		return portaria;
	}

	public void setPortaria(String portaria) {
		this.portaria = portaria;
	}

	private String nome;
	private Endereco endereco;
	private String piscina;
	private String portaria;
	private ArrayList<String> casas = new ArrayList<String>();
	private ArrayList<String> apartamentos = new ArrayList<String>();
	private int qtdc = 0;
	private int qtda = 0;

	public ArrayList<String> getApartamentos() {
		return apartamentos;
	}

	public void setApartamentos(Apartamento apartamento) {
		qtda = qtda + 1;
		this.apartamentos.add("\n" + qtda + " - " + apartamento.toString());
	}

	public Condominio(String nome, Endereco e, String portaria, String piscina) {
		setNome(nome);
		this.endereco = e;
		setPortaria(portaria);
		setPiscina(piscina);
	}

	public ArrayList<String> getCasas() {
		return casas;
	}

	public void setCasas(Casa casa) {
		qtdc = qtdc + 1;
		casas.add("\n" + qtdc + " - " + casa.toString());
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nEndereco: " + endereco.toString() + "\nPiscina: " + piscina + "\nPortaria: "
				+ portaria + "\ncasas: " + casas + "\nApartamentos: " + apartamentos;
	}
}

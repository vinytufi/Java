package Classes;

import java.util.ArrayList;

public class Apartamento {
	
	private ArrayList<String> comodos = new ArrayList<String>();
	private Garagem garagem;
	private Proprietario proprietario;
	private Endereco endereco;
	private int numeroDoApartamento;
	
	public Apartamento(String logradouro, String numero, String bairro, int numeroDoApartamento, String coberta, int qtdcarros, String nome, String telefone) {
		Endereco e = new Endereco(logradouro, numero, bairro);
		this.endereco = e;
		Garagem g = new Garagem(coberta, qtdcarros);
		this.garagem = g;
		Proprietario p = new Proprietario(nome, telefone);
		this.proprietario = p;
		this.numeroDoApartamento = numeroDoApartamento;
	}
	@Override
	public String toString() {
		return "Número do Apartamento: " + numeroDoApartamento + "\n" +proprietario.toString()+"\nGaragem: "+garagem.toString() +"\nEndereço: " + endereco.toString() + "\nComodos: "+comodos+"\n";
	}
	public ArrayList<String> getComodos() {
		return comodos;
	}
	public void setComodos(Comodo comodo) {
		this.comodos.add("\n"+comodo.toString());
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
	public int getNumeroDoApartamento() {
		return numeroDoApartamento;
	}
	public void setNumeroDoApartamento(int numeroDoApartamento) {
		this.numeroDoApartamento = numeroDoApartamento;
	}
}

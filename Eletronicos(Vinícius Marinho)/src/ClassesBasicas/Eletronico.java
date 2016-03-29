package ClassesBasicas;

public class Eletronico {
	private String marca, modelo, indicadorDeLigado;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getIndicadorDeLigado() {
		return indicadorDeLigado;
	}
	public void setIndicadorDeLigado(String indicadorDeLigado) {
		this.indicadorDeLigado = indicadorDeLigado;
	}
	public void ligar(Eletronico e){
		setIndicadorDeLigado("Ligado");
		StringBuffer saida = new StringBuffer(getClass().getName());
		String remover = "ClassesBasicas.";
		int pos = saida.indexOf(remover);
		saida.delete(pos, pos + remover.length());
		System.out.println(saida +" Ligado");
	}
	public void desligar(Eletronico e){
		setIndicadorDeLigado("Desligado");
		StringBuffer saida = new StringBuffer(getClass().getName());
		String remover = "ClassesBasicas.";
		int pos = saida.indexOf(remover);
		saida.delete(pos, pos + remover.length());
		System.out.println(saida +" Desligado");
	}
}

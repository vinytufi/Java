package Classes;

public class Garagem {
	private String coberta;
	private int qtdcarros;
	public String getCoberta() {
		return coberta;
	}
	public void setCoberta(String coberta) {
		this.coberta = coberta;
	}
	public int getQtdcarros() {
		return qtdcarros;
	}
	public void setQtdcarros(int qtdcarros) {
		this.qtdcarros = qtdcarros;
	}
	public Garagem(String coberta, int qtdcarros) {
		this.coberta = coberta;
		this.qtdcarros = qtdcarros;
	}
	@Override
	public String toString() {
		return "\nCoberta: "+coberta+"\nQuantidade de Carros: "+qtdcarros;
	}
	
}

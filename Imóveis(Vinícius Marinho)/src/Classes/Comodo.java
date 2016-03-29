package Classes;

public class Comodo {
	private String nome;
	private float area;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public Comodo(String nome, float area) {
		this.nome = nome;
		this.area = area;
	}
	@Override
	public String toString() {
		return "Nome: " + nome +"\n¡rea: " +area+"m≤";
	}
	
}

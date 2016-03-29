package ClassesBasicas;

public class Retangulo extends FormaGeometrica{
	private float comprimento;
	private float altura;
	
	public float getComprimento() {
		return comprimento;
	}

	public float getAltura() {
		return altura;
	}

	public Retangulo(float comprimento, float altura) {
		this.comprimento = comprimento;
		this.altura = altura;
	}
	
	public float calcularArea(){
		return comprimento*altura;
	}
	
	public float calcularPerimetro(){
		if(altura == 0){
			return 0;
		}else if (comprimento == 0){
			return 0;
		}else{
		return (comprimento*2)+(altura*2);
		}
	}
	
}

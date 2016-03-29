package ClassesBasicas;

import java.util.ArrayList;

public class ColecaoFormas {
	public ColecaoFormas(Quadrado q1, Quadrado q2, Retangulo r1, Retangulo r2, Retangulo r3) {
		this.formas.add(q1);
		this.formas.add(q2);
		this.formas.add(r1);
		this.formas.add(r2);
		this.formas.add(r3);
	}

	ArrayList<FormaGeometrica> formas = new ArrayList();

	public float areaTotal() {
		float total = 0;
		for (int i = 0; i < this.formas.size(); i++) {
			total = total + this.formas.get(i).calcularArea();
		}
		return total;
	}

	public void imprimirAreaTotal() {
		System.out.println("Área total do array: " + this.areaTotal());
	}

	public float perimetroTotal() {
		float total = 0;
		for (int i = 0; i < this.formas.size(); i++) {
			total = total + this.formas.get(i).calcularPerimetro();
		}
		return total;
	}

	public void imprimirPerimetroTotal() {
		System.out.println("Perímetro total do array: " + this.perimetroTotal());
	}

	public void qtdQuadrados() {
		int qtd = 0;
		for (int i = 0; i < this.formas.size(); i++) {
			if (this.formas.get(i).getClass().getName().equals("ClassesBasicas.Quadrado")) {
				qtd = qtd + 1;
			}
		}
		System.out.println("Quantidade de quadrados: " + qtd);
	}

	public void imprimirAlturaEComprimentoRetangulo() {
		ArrayList<Retangulo> retangulos = new ArrayList();
		for (int i = 0; i < this.formas.size(); i++) {
			if (this.formas.get(i).getClass().getName().equals("ClassesBasicas.Retangulo")) {
				retangulos.add((Retangulo) formas.get(i));
			}
		}
		for (int i = 0; i < retangulos.size(); i++) {
			System.out.println(i+1+"º retângulo\nAltura: " + retangulos.get(i).getAltura() + "\nComprimento: "
					+ retangulos.get(i).getComprimento());
		}
	}

}

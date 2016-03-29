package Teste;

import ClassesBasicas.ColecaoFormas;
import ClassesBasicas.Quadrado;
import ClassesBasicas.Retangulo;

public class Teste {
	public static void main(String[] args) {
		Quadrado q1 = new Quadrado(0,0);
		Quadrado q2 = new Quadrado(8,0);
		Retangulo r1 = new Retangulo(0,0);
		Retangulo r2 = new Retangulo(4,9);
		Retangulo r3 = new Retangulo(3,0);
		ColecaoFormas formasPSC = new ColecaoFormas(q1,q2,r1,r2,r3);
		formasPSC.imprimirAreaTotal();
		formasPSC.imprimirPerimetroTotal();
		formasPSC.qtdQuadrados();
		formasPSC.imprimirAlturaEComprimentoRetangulo();
	}
}

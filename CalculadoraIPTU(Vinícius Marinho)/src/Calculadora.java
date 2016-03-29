import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {
		String tipo;
		int confirmacao;
		float valor, desconto;
		tipo = JOptionPane.showInputDialog(
				"Informe o tipo de imóvel(R - Residencial, N - Não-Residencial, Qualquer coisa - Territorial)");
		if ((tipo.equals("R")) || (tipo.equals("r"))) {
			confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que o tipo de imóvel é: Residencial?",
					"Confirmação", JOptionPane.YES_NO_OPTION);
			tipo = "R";
		} else if ((tipo.equals("N")) || (tipo.equals("n"))) {
			confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que o tipo de imóvel é: Não-Residencial?",
					"Confirmação", JOptionPane.YES_NO_OPTION);
			tipo = "N";
		} else {
			confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que o tipo de imóvel é: Territorial?",
					"Confirmação", JOptionPane.YES_NO_OPTION);
		}
		if (confirmacao == JOptionPane.YES_OPTION) {
			try {
				valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do imóvel"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Informe apenas valores reais");
				valor = 0;
			}
			try {
				desconto = Float.parseFloat(
						JOptionPane.showInputDialog("Informe o valor do desconto, se não houver desconto informe 0"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Informe apenas valores reais");
				desconto = 0;
			}
		} else {
			valor = 0;
			desconto = 0;
		}
		if (tipo.equals("R")) {
			if ((95450 <= valor) && (238626 >= valor)) {
				float faixa1, faixa2, total;
				faixa1 = 95450 * 6 / 1000;
				faixa2 = (valor - 95450) * 7 / 1000;
				total = faixa1 + faixa2 - desconto;
				JOptionPane.showMessageDialog(null, "Valor do IPTU: " + total);
			} else if ((238626 <= valor) && (417596 >= valor)) {
				float faixa1, faixa2, faixa3, total;
				faixa1 = 95450 * 6 / 1000;
				faixa2 = 143176 * 7 / 1000;
				faixa3 = (valor - (95450 + 143176)) * 75 / 10000;
				total = faixa1 + faixa2 + faixa3 - desconto;
				JOptionPane.showMessageDialog(null, "Valor do IPTU: " + total);
			} else if ((417596 <= valor) && (715879 >= valor)) {
				float faixa1, faixa2, faixa3, faixa4, total;
				faixa1 = 95450 * 6 / 1000;
				faixa2 = 143176 * 7 / 1000;
				faixa3 = 178970 * 75 / 10000;
				faixa4 = (valor - (95450 + 143176 + 178970)) * 8 / 1000;
				total = faixa1 + faixa2 + faixa3 + faixa4 - desconto;
				JOptionPane.showMessageDialog(null, "Valor do IPTU: " + total);
			} else if ((715879 <= valor) && (954505 >= valor)) {
				float faixa1, faixa2, faixa3, faixa4, faixa5, total;
				faixa1 = 95450 * 6 / 1000;
				faixa2 = 143176 * 7 / 1000;
				faixa3 = 178970 * 75 / 10000;
				faixa4 = 298283 * 8 / 1000;
				faixa5 = (valor - (95450 + 143176 + 178970 + 298283)) * 85 / 10000;
				total = faixa1 + faixa2 + faixa3 + faixa4 + faixa5 - desconto;
				JOptionPane.showMessageDialog(null, "Valor do IPTU: " + total);
			} else if ((954505 <= valor) && (1193131 >= valor)) {
				float faixa1, faixa2, faixa3, faixa4, faixa5, faixa6, total;
				faixa1 = 95450 * 6 / 1000;
				faixa2 = 143176 * 7 / 1000 * 7 / 1000;
				faixa3 = 178970 * 75 / 10000;
				faixa4 = 298283 * 8 / 1000;
				faixa5 = 238626 * 85 / 10000;
				faixa6 = valor - (95450 + 143176 + 178970 + 298283 + 238626) * 9 / 1000;
				total = faixa1 + faixa2 + faixa3 + faixa4 + faixa5 + faixa6 - desconto;
				JOptionPane.showMessageDialog(null, "Valor do IPTU: " + total);
			} else if (1193131 <= valor) {
				float faixa1, faixa2, faixa3, faixa4, faixa5, faixa6, faixa7, total;
				faixa1 = 95450 * 6 / 1000;
				faixa2 = 143176 * 7 / 1000 * 7 / 1000;
				faixa3 = 178970 * 75 / 10000;
				faixa4 = 298283 * 8 / 1000;
				faixa5 = 238626 * 85 / 10000;
				faixa6 = 238626 * 9 / 1000;
				faixa7 = valor - (95450 + 143176 + 178970 + 298283 + 238626 + 238626) * 1 / 100;
				total = faixa1 + faixa2 + faixa3 + faixa4 + faixa5 + faixa6 + faixa7 - desconto;
				JOptionPane.showMessageDialog(null, "Valor do IPTU: " + total);
			} else {
				JOptionPane.showMessageDialog(null, "Impossível calcular valor informado");
			}
		} else if (tipo.equals("N")) {
			if ((35793 <= valor) && (119313 >= valor)) {
				float faixa1, faixa2, total;
				faixa1 = 35793 * 12 / 1000;
				faixa2 = (valor - 35793) * 13 / 1000;
				total = faixa1 + faixa2 - desconto;
				JOptionPane.showMessageDialog(null, "Valor do IPTU: " + total);
			} else if ((119313 <= valor) && (596565 >= valor)) {
				float faixa1, faixa2, faixa3, total;
				faixa1 = 35793 * 12 / 1000;
				faixa2 = 83520 * 13 / 1000;
				faixa3 = (valor - (35793 + 83520)) * 14 / 1000;
				total = faixa1 + faixa2 + faixa3 - desconto;
				JOptionPane.showMessageDialog(null, "Valor do IPTU: " + total);
			} else if ((596565 <= valor) && (1193131 >= valor)) {
				float faixa1, faixa2, faixa3, faixa4, total;
				faixa1 = 35793 * 12 / 1000;
				faixa2 = 83520 * 13 / 1000;
				faixa3 = 477252 * 14 / 1000;
				faixa4 = (valor - (35793 + 83520 + 477252)) * 15 / 1000;
				total = faixa1 + faixa2 + faixa3 + faixa4 - desconto;
				JOptionPane.showMessageDialog(null, "Valor do IPTU: " + total);
			} else if (1193131 <= valor) {
				float faixa1, faixa2, faixa3, faixa4, faixa5, total;
				faixa1 = 35793 * 12 / 1000;
				faixa2 = 83520 * 13 / 1000;
				faixa3 = 477252 * 14 / 1000;
				faixa4 = 596566 * 15 / 1000;
				faixa5 = (valor - (35793 + 83520 + 477252 + 596566)) * 16 / 1000;
				total = faixa1 + faixa2 + faixa3 + faixa4 + faixa5 - desconto;
				JOptionPane.showMessageDialog(null, "Valor do IPTU: " + total);
			} else {
				JOptionPane.showMessageDialog(null, "Impossível calcular valor informado");
			}
		} else {
			if ((47724 <= valor) && (357939 >= valor)) {
				float faixa1, faixa2, total;
				faixa1 = 47724 * 1 / 100;
				faixa2 = (valor - 47724) * 16 / 1000;
				total = faixa1 + faixa2 - desconto;
				JOptionPane.showMessageDialog(null, "Valor do IPTU: " + total);
			} else if ((357939 <= valor) && (715879 >= valor)) {
				float faixa1, faixa2, faixa3, total;
				faixa1 = 47724 * 1 / 100;
				faixa2 = 310215 * 16 / 1000;
				faixa3 = (valor - (47724 + 310215)) * 2 / 100;
				total = faixa1 + faixa2 + faixa3 - desconto;
				JOptionPane.showMessageDialog(null, "Valor do IPTU: " + total);
			} else if ((715879 <= valor) && (1193131 >= valor)) {
				float faixa1, faixa2, faixa3, faixa4, total;
				faixa1 = 47724 * 1 / 100;
				faixa2 = 310215 * 16 / 1000;
				faixa3 = 357940 * 2 / 100;
				faixa4 = (valor - (47724 + 310215 + 357940)) * 25 / 1000;
				total = faixa1 + faixa2 + faixa3 + faixa4 - desconto;
				JOptionPane.showMessageDialog(null, "Valor do IPTU: " + total);
			} else if (1193131 <= valor) {
				float faixa1, faixa2, faixa3, faixa4, faixa5, total;
				faixa1 = 47724 * 1 / 100;
				faixa2 = 310215 * 16 / 1000;
				faixa3 = 357940 * 2 / 100;
				faixa4 = 477252 * 25 / 1000;
				faixa5 = (valor - (47724 + 310215 + 357940)) * 3 / 100;
				total = faixa1 + faixa2 + faixa3 + faixa4 + faixa5 - desconto;
				JOptionPane.showMessageDialog(null, "Valor do IPTU: " + total);
			} else {
				JOptionPane.showMessageDialog(null, "Impossível calcular valor informado");
			}
		}
	}
}

package GUI;

import javax.swing.JOptionPane;

import Interface.IFachada;
import Negocio.Negocio;

public class GUI implements IFachada {
	public static void main(String[] args) {
		menu(0);
	}

	static void menu(int resposta) {
		try {
			while (resposta != 1 && resposta != 2 && resposta != 3) {
				resposta = Integer.parseInt(JOptionPane
						.showInputDialog("Informe o que deseja: 1 - Cadastrar Usuário, 2 - Efetuar Login ou 3 - sair"));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Não pode conter letras nesse campo");
			menu(0);
		}
		if (resposta == 1){
			cadastrarUsuario();
		} else if (resposta == 2){
			efetuarLogin();
		}else if (resposta == 3){
			JOptionPane.showMessageDialog(null, "Você saiu do programa");
		}
	}

	static void cadastrarUsuario() {
		String login, senha, repetesenha, nome, email;
		login = JOptionPane.showInputDialog("Informe Login");
		senha = JOptionPane.showInputDialog("Informe Senha");
		repetesenha = JOptionPane.showInputDialog("Repita a Senha");
		nome = JOptionPane.showInputDialog("Informe Nome");
		email = JOptionPane.showInputDialog("Informe E-mail");
		Negocio n = new Negocio();
		n.cadastrarUsuario(login, senha, repetesenha, nome, email);
		menu(0);
	}

	static void efetuarLogin() {
		String login, senha;
		login = JOptionPane.showInputDialog("Informe Login");
		senha = JOptionPane.showInputDialog("Informe Senha");
		Negocio n = new Negocio();
		n.efetuarLogin(login, senha);
		menu(0);
	}
}

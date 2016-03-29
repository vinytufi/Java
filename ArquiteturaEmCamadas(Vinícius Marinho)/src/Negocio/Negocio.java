package Negocio;

import javax.swing.JOptionPane;

import Classe.Usuario;
import Dados.Dados;

public class Negocio {

	public void cadastrarUsuario(String login, String senha, String repetesenha, String nome, String email) {
		Dados d = new Dados();
		if (login.trim().equals("") || login == null || senha.trim().equals("") || senha == null
				|| repetesenha.trim().equals("") || repetesenha == null || nome.trim().equals("") || nome == null) {
			JOptionPane.showMessageDialog(null,
					"N�o foi poss�vel cadastrar: login, senha, repete a senha e nome s�o campos obrigat�rios");
		} else {
			if (login.trim().length() >= 5 && login.trim().length() <= 10) {
				if (d.buscarLogin(login) == false) {
					if (senha.trim().length() >= 6 && senha.trim().length() <= 12) {
						if (senha.equals(repetesenha)) {
							if (nome.trim().length() > 0 && nome.trim().length() <= 50) {
								if (email.trim().length() > 0 && email.trim().length() <= 30) {
									Usuario u = new Usuario();
									u.setCodigo(d.contarUsuarios() + 1);
									u.setLogin(login);
									u.setSenha(repetesenha);
									u.setNome(nome);
									u.setEmail(email);
									d.cadastrarUsuario(u);
								} else {
									JOptionPane.showMessageDialog(null,
											"N�o foi poss�vel cadastrar: Email deve ter de 1 a 30 caracteres");
								}
							} else {
								JOptionPane.showMessageDialog(null,
										"N�o foi poss�vel cadastrar: Nome deve ter de 1 a 50 caracteres");
							}
						} else {
							JOptionPane.showMessageDialog(null, "N�o foi poss�vel cadastrar: Senha n�o confere");
						}
					} else {
						JOptionPane.showMessageDialog(null,
								"N�o foi poss�vel cadastrar: Senha deve ter de 6 a 12 caracteres");
					}
				} else {
					JOptionPane.showMessageDialog(null, "N�o foi poss�vel cadastrar: Login Informado j� existe");
				}
			} else {
				JOptionPane.showMessageDialog(null, "N�o foi poss�vel cadastrar: Login deve ter de 5 a 10 caracteres");
			}

		}
	}

	public void efetuarLogin(String login, String senha) {
		Dados d = new Dados();
		if (login.trim().equals("") || login == null || senha.trim().equals("") || senha == null) {
			JOptionPane.showMessageDialog(null, "Campos Obrigat�rios n�o informados(Login e/ou Senha)");
		} else {
			if (d.autenticarUsuario(login, senha) == true) {
				JOptionPane.showMessageDialog(null, "Usu�rio autenticado com sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "Login e/ou Senha inv�lidos");
			}
		}
	}

}

package Interface;

import Negocio.Negocio;

public interface IFachada {

	static void cadastrarUsuario(String login, String senha, String repetesenha, String nome, String email) {
		Negocio n = new Negocio();
		n.cadastrarUsuario(login, senha, repetesenha, nome, email);
	}

	static void efetuarLogin(String login, String senha) {
		Negocio n = new Negocio();
		n.efetuarLogin(login, senha);
	}
}

package Dados;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Classe.Usuario;

public class Dados {
	ArrayList< Usuario > usuarios = new ArrayList< Usuario >();
	public void cadastrarUsuario(Usuario u) {
		usuarios.add(u);
		JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso!");
	}
	public int contarUsuarios() {
		int itemCount = usuarios.size();
		return itemCount;
	}
	public boolean buscarLogin(String login){
		for(int i=0;i<usuarios.size();i++){
			  if (login.equals(usuarios.get(i).getLogin())){
				  return true;
			  }
			}
		return false;
	}
	public boolean autenticarUsuario(String login, String senha){
		for(int i=0;i<usuarios.size();i++){
			  if (login.equals(usuarios.get(i).getLogin())){
				  if (senha.equals(usuarios.get(i).getLogin())){
					  return true;
				  }
			  }
		}
		return false;
	}
}

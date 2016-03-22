package gui;

import basicas.Aluno;
import fachadas.Fachada;
import fachadas.IFachada;

public class Aplicacao {
	
	private static IFachada fachada = new Fachada( );

	public static void main(String[ ] args) {
		Aluno aluno = new Aluno("João", "123456");
		fachada.inserirAluno(aluno);
	}

}

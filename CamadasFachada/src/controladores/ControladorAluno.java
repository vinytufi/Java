package controladores;

import basicas.Aluno;
import repositorios.IRepositorioAluno;
import repositorios.RepositorioAlunoCollection;

public class ControladorAluno {
	
	private IRepositorioAluno repAluno;
	
	public ControladorAluno() {
		this.repAluno = new RepositorioAlunoCollection();
	}
	
	public void inserirAluno(Aluno aluno) {
		this.repAluno.inserirAluno(aluno);		
	}

	/* Continua aqui a implementação dos demais métodos! */

}

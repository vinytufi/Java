package fachadas;

import basicas.Aluno;
import controladores.ControladorAluno;

public class Fachada implements IFachada {
	
	private ControladorAluno controladorAluno;
	
	public Fachada() {
		this.controladorAluno = new ControladorAluno();
	}

	@Override
	public void inserirAluno(Aluno aluno) {
		this.controladorAluno.inserirAluno(aluno);		
	}

	@Override
	public void alterarAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerAluno(String matricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Aluno buscarAluno(String matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verificarExistenciaAluno(String matricula) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/* Continua aqui a declaração de mais operações, inclusive de outras entidades! */

}

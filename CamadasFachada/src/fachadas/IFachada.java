package fachadas;

import basicas.Aluno;

public interface IFachada {
	
	public void inserirAluno(Aluno aluno);
	
	public void alterarAluno(Aluno aluno);
	
	public void removerAluno(String matricula);
	
	public Aluno buscarAluno(String matricula);
	
	public boolean verificarExistenciaAluno(String matricula);
	
	/* Continua aqui a declara��o de mais opera��es, inclusive de outras entidades! */

}

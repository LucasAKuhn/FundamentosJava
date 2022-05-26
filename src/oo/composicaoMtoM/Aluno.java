package oo.composicaoMtoM;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<Curso>();
	
	Aluno(String nome) {
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);		
	}	
	
	//Concertar o erro:
	//[oo.composicaoMtoM.Aluno@29f69090, oo.composicaoMtoM.Aluno@568bf312]
	public String toString() {
		return nome;
	}
}

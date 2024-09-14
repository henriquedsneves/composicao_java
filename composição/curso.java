package oo.composição;

import java.util.ArrayList;

public class curso {
	final String nome;
	
	final ArrayList<Aluno> alunos = new ArrayList<>();
	curso(String nome){
		this.nome = nome;
	}
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos1.add(this);
	}

}

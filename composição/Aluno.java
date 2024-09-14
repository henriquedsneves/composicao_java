package oo.composição;

import java.util.ArrayList;

public class Aluno {
	final String nome;
	final ArrayList<curso> cursos1 = new ArrayList<>();
	Aluno(String nome){
		this.nome = nome;
		
	}
	void adicionarcurso(curso cursos) {
		this.cursos1.add(cursos);
		cursos.alunos.add(this);
	}

}

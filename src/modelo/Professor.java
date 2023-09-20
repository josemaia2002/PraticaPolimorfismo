package modelo;

import java.util.ArrayList;

public class Professor extends Funcionario {
	private String especialidade;
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public void addAluno(Aluno a) {
		alunos.add(a);
	}
	
	public void removeAluno(Aluno a) {
		alunos.remove(a);
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	
	
}

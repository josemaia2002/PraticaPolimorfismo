package dao;

import java.util.ArrayList;

import modelo.Aluno;
import modelo.Funcionario;
import modelo.Professor;
import modelo.Recepcionista;

public class DataBase {
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public void addFuncionario(Funcionario f) {
		funcionarios.add(f);
	}
	
	public void removeFuncionario(Funcionario f) {
		funcionarios.remove(f); 
	}
	
	public void addAluno(Aluno a) {
		alunos.add(a);
	}
	
	public void removeAluno(Aluno a) {
		alunos.remove(a); 
	}

	public void listFuncionarios() {
		System.out.println("#################### Funcionarios ########################################");
		for(Funcionario f : funcionarios) {
			System.out.print("Matricula: 00" + f.getMatricula() + " ");
			System.out.print("Nome.: " + f.getNome() + " ");
			System.out.print("Tipo.: " + f.getClass() + " ");
			
			if(f instanceof Professor) {
				System.out.print("[" + ((Professor) f).getEspecialidade() + "]");
			}
			System.out.println();
		}
		System.out.println("##########################################################################");
		System.out.println();
	}
	
	public void listProfessores() {
		System.out.println("#################### Professores ########################################");
		for(Funcionario f : funcionarios) {						
			if(f instanceof Professor) {
				System.out.println("Professor [" + ((Professor) f).getNome() + "]");
				for(Aluno a : ((Professor) f).getAlunos()) {
					System.out.print("Aluno >>> " + a.getNome() + " ");
					a.list();
				}
			}
		}
		System.out.println("#########################################################################");
		System.out.println();
	}
	
	public void listRecepcionistas() {
		System.out.println("#################### Recepcionistas ########################################");
		for(Funcionario f : funcionarios) {						
			if(f instanceof Recepcionista) {
				System.out.print("Nome.: " + ((Recepcionista) f).getNome() + " ");
				((Recepcionista) f).list();
			}
		}
		System.out.println("#########################################################################");
		System.out.println();
	}
	
	public void listAlunos() {
		System.out.println("#################### Alunos ########################################");
		for(Aluno a : alunos) {						
			System.out.print("Nome.: " + a.getNome() + " ");
			System.out.print("Idade.: " + a.getIdade() + " ");
			System.out.print("CPF.: " + a.getCpf() + " ");
			System.out.println();
		}
		System.out.println("#########################################################################");
		System.out.println();
	}
}

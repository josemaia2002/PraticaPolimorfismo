package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Aluno {
	private String nome;
	private int idade;
	private String cpf;
	private String nascimento;
	private ArrayList<Treino> treinos = new ArrayList<Treino>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	public void addTreino(Treino t) {
		treinos.add(t);
	}
	
	public void removeTreino(Treino t) {
		treinos.remove(t);
	}

	public void list() {
		System.out.print("{");
		int index = 0;
		for(Treino t: treinos) {
			if(index == 0) {
				System.out.print(t.getHorario() + "=" + t.getTipo());
			}
			else {
				System.out.print(", " + t.getHorario() + "=" + t.getTipo());
			}
			index++;
		}
		System.out.println("}");
	}
}

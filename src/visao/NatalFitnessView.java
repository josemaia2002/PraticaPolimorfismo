package visao;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import modelo.Funcionario;
import modelo.Professor;
import modelo.Recepcionista;
import modelo.Aluno;
import modelo.Treino;
import dao.DataBase;

public class NatalFitnessView {

	public static void main(String[] args) throws ParseException {
		Funcionario f1 = new Professor();
		Funcionario f2 = new Professor();
		Funcionario f3 = new Recepcionista();
		Funcionario f4 = new Recepcionista();
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		// Professor 1
		((Professor)f1).setNome("Popeye");
		((Professor)f1).setMatricula(3);
		((Professor)f1).setEspecialidade("Musculacao");
		((Professor)f1).addAluno(a1);

		// Professor 2
		((Professor)f2).setNome("Phelps");
		((Professor)f2).setMatricula(4);
		((Professor)f2).setEspecialidade("Natacao");
		((Professor)f2).addAluno(a2);
		
		// Recepcionista 1
		((Recepcionista)f3).setNome("Lady Gaga");
		((Recepcionista)f3).setMatricula(2);
		((Recepcionista)f3).addHorario("Sexta=12:00"); 
		((Recepcionista)f3).addHorario("Quarta=12:00"); 
		
		// Recepcionista 2
		((Recepcionista)f4).setNome("Madona");
		((Recepcionista)f4).setMatricula(1);
		((Recepcionista)f4).addHorario("Terca=15:00"); 
		((Recepcionista)f4).addHorario("Segunda=07:00");
		
		
		// Aluno 1
		a1.setNome("Neymar");
		a1.setIdade(33);
		a1.setCpf("001.113.224-56");					
		a1.setNascimento("25-10-1990");
		
		Treino t1 = new Treino();
		t1.setHorario("10:00");
		t1.setTipo("Hipertrofia");
		t1.setProfessor(((Professor)f1));
		
		Treino t2 = new Treino();
		t2.setHorario("11:00");
		t2.setTipo("Ergometria");
		t2.setProfessor(((Professor)f1));
		
		a1.addTreino(t1);
		a1.addTreino(t2);
		
		// Aluno 2
		a2.setNome("Monica");
		a2.setIdade(47);
		a2.setCpf("011.123.456-78");					
		a2.setNascimento("12-04-1976");
		
		Treino t3 = new Treino();
		t3.setHorario("08:00");
		t3.setTipo("Nado de Costas");
		t3.setProfessor(((Professor)f2));
		
		Treino t4 = new Treino();
		t4.setHorario("07:00");
		t4.setTipo("Nado Livre");
		t4.setProfessor(((Professor)f2));
		
		a2.addTreino(t3);
		a2.addTreino(t4);
		
		DataBase db = new DataBase();
		
		db.addFuncionario(f1);
		db.addFuncionario(f2);
		db.addFuncionario(f3);
		db.addFuncionario(f4);
		
		db.addAluno(a1);
		db.addAluno(a2);
		
		db.listFuncionarios();
		
		db.listProfessores();
		
		db.listRecepcionistas();
		
		db.listAlunos();
		
		
	}

}

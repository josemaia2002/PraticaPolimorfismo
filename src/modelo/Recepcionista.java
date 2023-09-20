package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Recepcionista extends Funcionario {
	private ArrayList<String> horarios = new ArrayList<String>();

	public void addHorario(String horario) {
		horarios.add(horario);
	}
	
	public void removeHorario(String horario) {
		horarios.remove(horario);
	}

	public void list() {
		System.out.print("{");
		int index = 0;
		for(String horario : horarios) {
			if(index == 0) {
				System.out.print(horario);
			}
			else {
				System.out.print(", " + horario);
			}
			index++;
		}
		System.out.println("}");
	}
}

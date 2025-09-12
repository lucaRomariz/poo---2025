package aula06;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//Lista Básica
		
		ArrayList<String> disciplinas = new ArrayList<String>();
		disciplinas.add("POO");
		disciplinas.add("D.I");
		disciplinas.add("B.D. II");
		disciplinas.add("R.C");

		//Create
		System.out.println(disciplinas); 
		
		//Read
		System.out.println(disciplinas.get(2));
		
		//Update
		disciplinas.set(1, "B.D. II");
		disciplinas.set(2, "D.I");
		
		//Delete
		disciplinas.remove(disciplinas.get(3));
		
		for(int i = 0; i < disciplinas.size(); i++) {
			System.out.println("Disciplina "+ (i + 1) + ": " + disciplinas.get(i));
		}
		
		for (String disciplina : disciplinas) {
			System.err.println(disciplina);
		}
		
		System.out.println(disciplinas.contains("POO"));
		System.out.println(disciplinas.contains("POO II"));
	}
	
}

package Aula08;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String [] args) {
		ArrayList<String> estudantes = new ArrayList <>();
		
		estudantes.add("Amy");
		estudantes.add("Bob");
		estudantes.add("Cindy");
		estudantes.add("David");
		
		System.out.println(estudantes.toString()); 
		System.out.println(estudantes.size());
		
		estudantes.add(0, "Nick");
		estudantes.add(1, "Mike");
		estudantes.remove(3);
		
		System.out.println(estudantes.toString()); 
		System.out.println(estudantes.size());
	}
}

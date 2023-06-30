package Aula05;

import javax.swing.JOptionPane;

public class StringEquality {
	public static void main(String[] args) {

    String name = JOptionPane.showInputDialog("Digite seu nome");
    
    if (name.equals("Moe")) {
		System.out.println("You are the king of the rock");
	} else {
        System.out.println("You're not a king");
	}
    
    }
}


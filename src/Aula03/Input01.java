package Aula03;

import javax.swing.JOptionPane;

public class Input01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input = JOptionPane.showInputDialog("");
        System.out.println(input);
        int parse = Integer.parseInt(input);
        System.out.println(parse + 1);
        
        int num = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, "Enter a number:"));
}
}

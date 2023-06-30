package Aula03;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Só mensagem, sem input",
                "Bom dia Bom dia",
                3);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Lebron(1) ou Curry(2)??",
                "Goat",
                2,
                null,
                null,
                "Escreve ai po");
        
        
        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Boas Vindas",
                "Salve",
                0,
                null,
                acceptableValues,
                acceptableValues[1]);
        
        int goat;
        System.out.println(goat = Integer.parseInt(input1));
                
    }
}

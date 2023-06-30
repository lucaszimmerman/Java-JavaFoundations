package Aula04;

import javax.swing.JOptionPane;

public class NameMaker {
    
    public static void main(String args[])
    {
        String firstName;
        String middleName;
        String lastName;
        String fullName;
        
        firstName = JOptionPane.showInputDialog("Qual o seu primeiro nome?");
        middleName = JOptionPane.showInputDialog("Qual o seu nome do meio?");
        lastName = JOptionPane.showInputDialog("Qual o seu ultimo nome?");
        fullName = (firstName + " " + middleName + " " + lastName);
        System.out.println(fullName);
        
        System.out.println(firstName.compareTo(lastName));
    }
    
}

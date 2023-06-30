package Aula04;

import java.util.Scanner;


public class ProcessName {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String fullName = console.nextLine();
        int separator = fullName.indexOf(" ");
        String firstName = fullName.substring(0,separator);
        String lastName = fullName.substring(separator + 1);
        System.out.println("Your name is: " + lastName + ", "+firstName.charAt(0));
        
        // your code goes here
        
        console.close();
    }
}
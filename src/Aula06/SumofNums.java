package Aula06;

import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        
        do {
        	System.out.print("Enter a number (-1 to quit): ");
            number = console.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("The sum is " + sum);
        console.close();
    }
}

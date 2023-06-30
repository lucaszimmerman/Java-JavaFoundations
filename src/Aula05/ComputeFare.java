package Aula05;

import java.util.Scanner;

public class ComputeFare {

    public static void main(String args[]) {
    	Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the age \n");
        int age = keyboard.nextInt();
        int fare;
        
        if (age < 11) {
			fare = 3;
			System.out.println("A sua tarifa será de " + fare + " reais");
		}else if (age >11 && age <= 65) {
			fare = 5;
			System.out.println("A sua tarifa será de " + fare + " reais");
		} else {
			fare = 3;
            System.out.println("A sua tarifa será de " + fare + " reais");
		}

    }
}

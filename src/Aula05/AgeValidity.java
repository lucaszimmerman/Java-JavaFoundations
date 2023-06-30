package Aula05;

import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite sua idade:");
    int age = scanner.nextInt();
    Boolean drivingUnderAge = false;
    System.out.println(age <= 18);
    drivingUnderAge = true;
    System.out.println(drivingUnderAge);
    
    scanner.close();
    }
}

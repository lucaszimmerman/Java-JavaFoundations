package Aula05;

import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a color code: ");
        int currentColor = scanner.nextInt();

        if (currentColor == 1) {
            System.out.println("Next Traffic Light is green");
        } else if (currentColor == 2) {
            System.out.println("Next Traffic Light is yellow");
        } else if (currentColor == 3) {
            System.out.println("Next Traffic Light is red");
        } else {
            System.out.println("Invalid color");
        }
        scanner.close();
    }
}

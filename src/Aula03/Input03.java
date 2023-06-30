package Aula03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        System.out.println("Digite três numeros");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int total = n1+n2+n3;
        System.out.println("Total: " + total);
        
        //Remember to close the Scanner
        sc.close();
    }
}
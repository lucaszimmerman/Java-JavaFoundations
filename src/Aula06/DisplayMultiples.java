package Aula06;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String[] args) {

        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira um número
        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        // Exiba os múltiplos do número de 1 a 12 usando um loop for
        for (int i = 1; i <= 12; i++) {
            int multiple = number * i;
            System.out.println(number + "x" + i + " = " + multiple);
        }

        // Feche o objeto Scanner
        scanner.close();
    }
}

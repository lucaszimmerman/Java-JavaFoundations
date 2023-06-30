package Aula06;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {

        // Declare o PIN válido
        int pin = 1234;

        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite que o usuário insira o PIN
        System.out.print("Insira o PIN: ");

        // Loop while para validar o PIN
        while (true) {
            // Leia o PIN inserido pelo usuário
            int userPin = scanner.nextInt();

            // Compare o PIN inserido com o PIN válido
            if (userPin == pin) {
                System.out.println("PIN correto inserido. Acesso concedido.");
                break; // Saia do loop while
            } else {
                System.out.print("PIN incorreto. Insira novamente o PIN: ");
            }
        }

        // Feche o objeto Scanner
        scanner.close();
    }
}

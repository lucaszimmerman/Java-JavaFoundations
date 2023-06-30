package Aula05;

import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do filme \n");
        int price = scanner.nextInt();
        System.out.println("Qual a classificação do filme?");
        int rating = scanner.nextInt();
        
        if (price >= 12 && rating == 5) {
			System.out.println("Estou interessado em ver o filme");
		} else {
            System.out.println("Não estou interessado em ver esse filme");
		}
        
        

    }
}

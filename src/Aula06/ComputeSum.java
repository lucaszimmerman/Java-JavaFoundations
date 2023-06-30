package Aula06;

import java.util.Scanner;

public class ComputeSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i =0;
		int soma = 0;
		while(i <= 10) {
			System.out.println("Digite um número");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			soma += num;
			i++;
		}
		System.out.println("A soma dos números é: " + soma);
		sc.close();

	}

}
